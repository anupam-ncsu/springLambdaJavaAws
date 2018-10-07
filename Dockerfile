FROM openjdk:8-jdk-alpine

ADD target/lambdaSpringBootJavaApp.jar mydockerApp.jar

ENTRYPOINT ["java", "-jar", "mydockerApp.jar" ]