FROM openjdk:17-jdk 
COPY target/HelloWorldMaven-1.1.1-RELEASE.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
