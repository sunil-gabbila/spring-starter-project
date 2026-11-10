# Spring Starter Project

A simple Spring Boot application that serves as a starter project for building REST APIs. It includes a basic application bootstrap, a controller, and a service layer.

## Tech Stack

- Java 17
- Spring Boot 4.1.2
- Maven
- Spring Web Services starter

## Project Structure

```text
spring-starter-project
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── hulkhire
│   │   │           └── demo
│   │   │               ├── FisrtApplicationDemoApplication.java
│   │   │               ├── controller
│   │   │               │   └── TempController.java
│   │   │               └── service
│   │   │                   └── TempService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
├── .gitignore
├── .gitattributes
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Features

- Spring Boot application bootstrap
- REST controller for HTTP endpoints
- Service layer example
- Maven-based project setup

## Prerequisites

Before running the project, ensure you have:

- JDK 17 or later
- Maven or Maven Wrapper
- Internet access for dependency download

## Run the Application

Using Maven Wrapper:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd clean install
mvnw.cmd spring-boot:run
```

After starting the application, the app runs on:

```text
http://localhost:8080
```

## API Endpoint

### GET /api/temp

Returns a sample message from the service layer.

Example response:

```text
Service method invoked successfully
```

## Configuration

The application configuration is stored in:

```properties
src/main/resources/application.properties
```

Current configuration:

```properties
spring.application.name=spring-starter-project
```

## Notes

This is a minimal starter application intended for learning and extending with additional controllers, services, repositories, and database integrations.

## License

This project does not currently include a license file. Add one if you intend to share or distribute it publicly.
