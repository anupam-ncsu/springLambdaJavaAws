FROM openjdk:8-jdk-alpine
EXPOSE 8080:8080
ADD target/lambdaSpringBootJavaApp.jar mydockerApp.jar
ENTRYPOINT ["java", "-jar", "mydockerApp.jar" ]