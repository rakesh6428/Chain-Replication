# Chain-Replication
Chain Replication for Supporting High Throughput and Availability

Development of a distributed systems environment.
Building Fail stop storage server using the Zookeeper service and gRPC framework

The prototype is based on the research paper "Chain Replication for Supporting High Throughput and Availability" by Robbert van Renesse and Fred B. Schneider

Chain replication is a new approach to coordinating
clusters of fail-stop storage servers. The approach is
intended for supporting large-scale storage services
that exhibit high throughput and availability without
sacrificing strong consistency guarantees. Besides
outlining the chain replication protocols themselves,
simulation experiments explore the performance
characteristics of a prototype implementation.
Throughput, availability, and several objectplacement
strategies (including schemes based on
distributed hash table routing) are discussed[1].

[1]R. Renesse and F. Schneider, "Chain Replication for Supporting High Throughput and Availability," in USENIX-OSDI, 2004
