FROM openjdk:8-jdk-alpine
EXPOSE 9080
ADD /target/login-app-backend-0.0.1-SNAPSHOT.jar login-app-backend.jar
ENTRYPOINT [“java”, “-Djava.security.egd=file:/dev/./urandom”,"-jar", “login-app-backend.jar”]
