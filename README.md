storm-kafka-0.8-plus
====================

Port of storm-kafka to support kafka >= 0.8

## Installing kafka 0.8 into local maven repository

Unfortunately the current beta pom is slightly broken ([KAFKA-974](https://issues.apache.org/jira/browse/KAFKA-974)) so you might want to build your own

- checkout kafka 0.8 branch from https://github.com/Krowd9/kafka
   - ```git clone https://github.com/Krowd9/kafka```
   - ```cd kafka```
   - ```git checkout 0.8```
- publish kafka to local maven repository
   - ```./sbt "++2.10.3 publish"```
