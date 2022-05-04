FROM gradle:7-jdk11-alpine AS builder
WORKDIR /usr/app
COPY . .
RUN gradle bootJar

FROM openjdk:11-jre-slim
WORKDIR /usr/app
COPY --from=builder /usr/app/build/libs/spring-0.0.3-SNAPSHOT.jar ./
CMD ["java", "-jar", "spring-0.0.3-SNAPSHOT.jar"]