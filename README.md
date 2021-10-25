### docker-compose experiments with Spring Boot

#### Running both services:

- have `Docker Desktop` running.

- run `mvn package` in both `domain-api` and `scheduler-api`.
- run `docker-compose build`
- run `docker-compose up`

#### Test `scheduler-api` to see them communicating:

`$ curl http://localhost:8081/api/v1/schedule`

