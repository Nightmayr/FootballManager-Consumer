FROM openjdk
ADD target/FootballManagerConsumer-0.0.1-SNAPSHOT.jar FootballManagerConsumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/FootballManagerConsumer-0.0.1-SNAPSHOT.jar"]
EXPOSE 8084
