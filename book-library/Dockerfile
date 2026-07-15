FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
WORKDIR /build
COPY src /buid/src
COPY pom.xml /build/pom/xml
RUN maven clean package

FROM eclipse-temurin:21-jre-alpine
COPY --from=build /build/target/*.jar /opt/app.jar
CMD ["java", "-jar", "/opt/app.jar"]