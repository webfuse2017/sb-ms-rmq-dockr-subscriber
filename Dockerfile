From openjdk:8
copy ./target/subscriber-0.0.1-SNAPSHOT.jar subscriber.jar
CMD ["java","-jar","subscriber.jar"]