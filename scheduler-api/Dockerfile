FROM openjdk:16-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY target/scheduler-api.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]