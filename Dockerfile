FROM openjdk:17
WORKDIR /app
COPY /target/loans-api-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]