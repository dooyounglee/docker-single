# Build
# FROM gradle:jdk17-alpine as builder
# COPY gradlew .
# COPY gradle gradle
# COPY build.gradle .
# COPY settings.gradle .
# COPY src src
# # RUN chmod +x ./gradlew # gradlew 실행권한 부여
# RUN gradle build
# # RUN ./gradlew bootJar # gradlew를 사용하여 실행 가능한 jar 파일 생성
# RUN ls

# Docker
FROM openjdk:17-alpine
EXPOSE 8080
ADD ./build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]