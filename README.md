1) Dockerizing Spring Boot + MySQL Project Step-by-Step: 
Spring Boot Project Creation: Developed a standard Spring Boot application with full CRUD capabilities, integrating a MySQL database using Spring Data JPA and application-level profiling (application-dev.yml, application-prod.yml).

Dockerfile Creation: Wrote a Dockerfile for the Spring Boot application to containerize the app. This included steps to:

Use openjdk:17 or eclipse-temurin base image.

Add the built JAR to the container.

Expose the appropriate application port (e.g., 8080).

Define the container entrypoint using ENTRYPOINT ["java", "-jar", "app.jar"].

Image Build & Verification: Used docker build -t springboot-app . to build the Docker image. Verified the image using docker images and ensured it contained the correct metadata and layers.

2) Run Spring Boot App Docker Image in a Container and Test CRUD REST APIs (with Profiling): 
Running the Container: Started the Docker container using docker run -p 8080:8080 springboot-app. Ensured the app was reachable from localhost:8080.

CRUD REST API Testing: Used Postman to validate all endpoints (Create, Read, Update, Delete). Ensured proper request-response flow with HTTP status codes.

Profile Activation: Demonstrated use of Spring Profiles by running the container with specific active profile:

Example: docker run -e "SPRING_PROFILES_ACTIVE=docker" springboot-app.

Verified different configurations per environment (e.g., logging level, database URL).

Logs & Observability: Captured container logs via docker logs for debugging and verified startup properties and profile-specific beans loaded.

3) Configure and Run MySQL + Spring Boot in Containers Using Docker Compose: 
Docker Compose Setup: Created a docker-compose.yml file to orchestrate multi-container setup:

MySQL Service: Pulled official MySQL image, configured with root credentials, database name, and volume mapping for data persistence.

Spring Boot Service: Depended on MySQL service, injected environment variables such as DB host, port, username, and password.

Networking: Used Docker Compose's internal bridge network to allow Spring Boot container to communicate with the MySQL container using the service name (e.g., mysql as DB host).

Startup Command: Executed docker-compose up --build to start both containers. Verified that Spring Boot waited for MySQL to initialize, connected successfully, and auto-created schema.

End-to-End Testing: Performed full lifecycle CRUD operations against APIs via Postman. Validated data persisted in the MySQL container and application profile behavior remained intact.

Production Readiness: Highlighted best practices like using named volumes, .env files for secrets, and health check endpoints for container monitoring.
