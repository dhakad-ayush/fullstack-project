
FROM eclipse-temurin:17-jdk-focal


WORKDIR /app


COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x mvnw

RUN ./mvnw dependency:go-offline


COPY src ./src


RUN ./mvnw clean install


EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/placement_assignment-0.0.1-SNAPSHOT.jar"]
