FROM openjdk:16-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY target/domain-api.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]