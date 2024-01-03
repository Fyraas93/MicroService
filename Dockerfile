# Use a base image with JRE to run the app
FROM adoptopenjdk:17-jre-hotspot

WORKDIR /app

# Copy the JAR file into the container
COPY target/gestiondestaches-0.0.1-SNAPSHOT.jar /app/gestiondestaches-0.0.1-SNAPSHOT.jar

# Set the command to run your Spring Boot application
CMD ["java", "-jar", "gestiondestaches-0.0.1-SNAPSHOT.jar"]
