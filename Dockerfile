FROM eclipse-temurin:21

LABEL mentainer="nathrohit48@gmail.com"

WORKDIR /app

COPY target/springboot-restful-webservices-docker-0.0.1-SNAPSHOT.jar /app/springboot-restful-webservices-docker.jar

ENTRYPOINT ["java", "-jar", "springboot-restful-webservices-docker.jar"]