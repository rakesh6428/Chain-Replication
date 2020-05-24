package edu.sjsu.cs249.chain;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import javax.print.attribute.standard.PDLOverrideSupported;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.Watcher.Event;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.server.SessionTracker.Session;
import org.junit.experimental.theories.Theories;

import com.squareup.okhttp.Response;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Attributes.Key;
import io.grpc.stub.StreamObserver;

public class ReplicaTailImplementation extends TailChainReplicaGrpc.TailChainReplicaImplBase implements Watcher {
	ZooKeeper zk;
	private long currentChainTail;
	private long currentChainHead;
	private long currentChainSuccessor;
	private long currentChainPredecessor;
	private TailChainReplicaGrpc.TailChainReplicaBlockingStub chainTail;
	private TailChainReplicaGrpc.TailChainReplicaBlockingStub chainHead;
	private TailChainReplicaGrpc.TailChainReplicaBlockingStub chainSuccessor;
	private TailChainReplicaGrpc.TailChainReplicaBlockingStub chainPredecessor;
	private Hashtable<String, Integer> dataTable = new Hashtable<String, Integer>();
	private AtomicBoolean retryChainCheck = new AtomicBoolean();
	private AtomicInteger count = new AtomicInteger(1);

	boolean conn = false;
	private Server server;

	public ReplicaTailImplementation(String IP, String path, String host, int port)
			throws IOException, InterruptedException, KeeperException {
		// TODO Auto-generated constructor stub

		server = ServerBuilder.forPort(port).addService(this).build();
		server.start();
		System.out.println("Server is getting started");

		zk = new ZooKeeper(IP, 3000, this);

		while (zk.getSessionId() == 0) {
			Thread.sleep(10);
		}

		long mySessionID = zk.getSessionId();
		System.out.println(mySessionID);
		String serverIP = host + ":" + port;
		zk.create(path + "/" + Long.toHexString(mySessionID), serverIP.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
				CreateMode.EPHEMERAL);
		checkPositions();
//		while (!conn) {
//			Thread.sleep(10);
//		}
		new ScheduledThreadPoolExecutor(1).scheduleAtFixedRate(() -> {
			if (retryChainCheck.getAndSet(false))
				checkPositions();
		}, 5, 5, TimeUnit.SECONDS);
	}

	private TailChainReplicaGrpc.TailChainReplicaBlockingStub getStub(long session)
			throws KeeperException, InterruptedException {
		byte data[] = zk.getData("/chain/" + Long.toHexString(session), false, null);
		InetSocketAddress addr = str2addr(new String(data).split("\n")[0]);
		ManagedChannel channel = ManagedChannelBuilder.forAddress(addr.getHostName(), addr.getPort()).usePlaintext()
				.build();
		return TailChainReplicaGrpc.newBlockingStub(channel);
	}

	private static InetSocketAddress str2addr(String addr) {
		int colon = addr.lastIndexOf(':');
		return new InetSocketAddress(addr.substring(0, colon), Integer.parseInt(addr.substring(colon + 1)));
	}

	private void setChainHead(long session) throws KeeperException, InterruptedException {
		if (currentChainHead == session) {
			return;
		}
		chainHead = null;
		chainHead = getStub(session);
		currentChainHead = session;
		System.out.println("Assignment of Head completed");
	}

	private void setChainTail(long session) throws KeeperException, InterruptedException {
		if (currentChainTail == session) {
			return;
		}
		chainTail = null;
		chainTail = getStub(session);
		currentChainTail = session;
		System.out.println("Assignment of tail completed");
	}

	private void setChainSuccessor(long session) throws KeeperException, InterruptedException {
		if (currentChainSuccessor == session) {
			return;
		}
		chainSuccessor = null;
		chainSuccessor = getStub(session);
		currentChainSuccessor = session;
		System.out.println("Assignment of successor completed");
	}

	private void setChainPredecessor(long session) throws KeeperException, InterruptedException {
		if (currentChainPredecessor == session) {
			return;
		}
		chainPredecessor = null;
		chainPredecessor = getStub(session);
		currentChainPredecessor = session;
		System.out.println("Assignment of predecessor completed");
	}

	private void checkPositions() {
		try {
			List<String> children = zk.getChildren("/chain", true);
			ArrayList<Long> sessions = new ArrayList<>();

			for (String child : children) {
				try {
					sessions.add(Long.parseLong(child, 16));
				} catch (NumberFormatException e) {
					// just skip non numbers
				}
			}
			sessions.sort(Long::compare);
			long head = sessions.get(0);
			long tail = sessions.get(children.size() - 1);
			long successor = 0;
			long predecessor = 0;
			if (children.size() > 1) {
				System.out.println("Number of nodes is : " + sessions.get(children.size()-1));
				System.out.println(sessions);
				for (int i = 0; i < children.size()-1; i++) {
					if (sessions.get(i) == zk.getSessionId()&&i<(children.size()-1)) {
						successor = sessions.get(i + 1);
					}
					if(sessions.get(i)==zk.getSessionId()&&i>0)
					{
							predecessor = sessions.get(i - 1);
						
				
					}

				}
			}
			setChainHead(head);
			setChainTail(tail);
			setChainSuccessor(successor);
			setChainPredecessor(predecessor);
			System.out.println("The head is " + head);
			System.out.println("The tail is " + tail);
			System.out.println("The successor is " + successor);
			System.out.println("The predecessor is " + predecessor);
		} catch (KeeperException | InterruptedException e) {
			retryChainCheck.set(true);
		}
	}

	@Override
	public void process(WatchedEvent event) {
		// TODO Auto-generated method stub
		KeeperState eventStatus = event.getState();
		System.out.println("event:" + eventStatus);
		if (event.getState().equals(Event.KeeperState.SyncConnected)) {
			conn = true;
		}
		if (event.getState().equals(Event.KeeperState.Expired) || event.getState().equals(Event.KeeperState.Closed)) {
			System.err.println("disconnected from zookeeper");
			System.exit(2);
		}
		checkPositions();

	}

	@Override
	public void proposeStateUpdate(TailStateUpdateRequest request, StreamObserver<ChainResponse> responseObserver) {
		// TODO Auto-generated method stub

		super.proposeStateUpdate(request, responseObserver);

	}

	@Override
	public void getLatestXid(LatestXidRequest request, StreamObserver<LatestXidResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.getLatestXid(request, responseObserver);
	}

	@Override
	public void stateTransfer(TailStateTransferRequest request, StreamObserver<ChainResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.stateTransfer(request, responseObserver);
	}

	@Override
	public void increment(TailIncrementRequest request, StreamObserver<HeadResponse> responseObserver) {
		// TODO Auto-generated method stub
		HeadResponse headResponse = null;
		System.out.println("Increment method is called from the client");
		if (zk.getSessionId() == currentChainHead) {

			System.out.println("The requested Key is:" + request.getKey());
			System.out.println("The requested Key is:" + request.getIncrValue());
//			if (!dataTable.containsKey(request.getKey())) {
//				int incrementValue = dataTable.containsKey(request.getKey()) ? dataTable.get(request.getKey()) : 0;
//				dataTable.put(request.getKey(), incrementValue + request.getIncrValue());
//				System.out.println("Key:" + request.getKey() + "Value:" + dataTable.get(request.getKey()));
//			}
			if (dataTable.containsKey(request.getKey())) {
				dataTable.computeIfPresent(request.getKey(), (k, v) -> v + request.getIncrValue());
				System.out.println("Key:" + request.getKey() + "Value:" + dataTable.get(request.getKey()));
			} 
			else {
				dataTable.put(request.getKey(), request.getIncrValue());
				System.out.println("Key not in the hashtable: But inserting now!!! Key:" + request.getKey() + "Value:"
						+ dataTable.get(request.getKey()));
			}
			headResponse.newBuilder().setRc(0).build();

			long src = zk.getSessionId();
			int xid = count.incrementAndGet();
			String key = request.getKey();
			int value = request.getIncrValue();
			String host = request.getHost();
			int port = request.getPort();
			int cxid = request.getCxid();
			TailStateUpdateRequest stateUpdateRequest = TailStateUpdateRequest.newBuilder().setSrc(src).setXid(xid)
					.setKey(key).setValue(value).setHost(host).setPort(port).setCxid(cxid).build();
			checkPositions();
			if (chainSuccessor != null) {

				// create a variable and printout the chain response too.

				chainSuccessor.proposeStateUpdate(stateUpdateRequest);

			}
		} else {
			headResponse.newBuilder().setRc(1).build();
		}
//		System.out.println("the head response is:"+headResponse.getRc());
		responseObserver.onNext(headResponse);
		responseObserver.onCompleted();

//		super.increment(request, responseObserver);
	}

	@Override
	public void delete(TailDeleteRequest request, StreamObserver<HeadResponse> responseObserver) {
		// TODO Auto-generated method stub

		HeadResponse headResponse = null;
		if (zk.getSessionId() == currentChainHead) {
			if (dataTable.containsKey(request.getKey())) {
				dataTable.remove(request.getKey());
			} else {
				dataTable.put(request.getKey(), 0);

			}
			headResponse.newBuilder().setRc(0).build();
			long src = zk.getSessionId();
			int xid = count.incrementAndGet();
			String key = request.getKey();
			int value = 0;
			String host = request.getHost();
			int port = request.getPort();
			int cxid = request.getCxid();
			TailStateUpdateRequest stateUpdateRequest = TailStateUpdateRequest.newBuilder().setSrc(src).setXid(xid)
					.setKey(key).setValue(0).setHost(host).setPort(port).setCxid(cxid).build();
			checkPositions();
			if (chainSuccessor != null) {
				chainSuccessor.proposeStateUpdate(stateUpdateRequest);
			}

		} else {
			headResponse.newBuilder().setRc(1).build();
		}
		responseObserver.onNext(headResponse);
		responseObserver.onCompleted();
		// super.delete(request, responseObserver);
	}

	@Override
	public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
		// TODO Auto-generated method stub
		int value = 0;
		GetResponse getResponse = null;
		if (zk.getSessionId() == currentChainTail) {
			if (dataTable.containsKey(request.getKey())) {
				value = dataTable.get(request.getKey());
				getResponse.newBuilder().setValue(value).setRc(0).build();
			} else {
				getResponse.newBuilder().setRc(2).build();
			}

		} else {
			getResponse.newBuilder().setRc(1).build();
		}
		responseObserver.onNext(getResponse);
		responseObserver.onCompleted();
//		super.get(request, responseObserver);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
		System.out.println("Enter the Host on which server has to run:");
		Scanner hostInput = new Scanner(System.in);
		String host = hostInput.nextLine(); // "10.250.28.120";
		System.out.println("Enter the port on which server has to run:");
		// Scanner portInput = new Scanner( System.in );
		int port = Integer.parseInt(hostInput.nextLine()); // 2223;//
		System.out.println("server started on " + host + ":" + port);
		System.out.println("Enter the IP of the Zookeeper server:");
		// Scanner ipInput = new Scanner( System.in );
		String IP = hostInput.nextLine();// "10.250.28.120:2222";//
		System.out.println("Enter the Path of the Zookeeper directory:");
		// Scanner pathInput = new Scanner( System.in );
		String pathString = hostInput.nextLine();// "/chain";

		ReplicaTailImplementation tailMain = new ReplicaTailImplementation(IP, pathString, host, port);

		tailMain.server.awaitTermination();
	}

}
