FROM java:8
EXPOSE 9080
ADD /target/login-app-backend.jar login-app-backend.jar
ENTRYPOINT [“java”, “-jar”, “login-app-backend.jar”]