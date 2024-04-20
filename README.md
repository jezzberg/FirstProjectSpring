# Java Spring Boot API Project

This Java Spring Boot project implements a simple API for managing a person's data.

## Folder Structure

- **api**: Contains the controller class `PersonController.java`.
- **dao**: Contains the data access object class `FakePersonAccessService.java`.
- **module**: Contains the `Person.java` class defining the structure of a person object.
- **service**: Contains the service class `PersonService.java`.
- **FirstApiWithSpringApplication.java**: Main class to start the Spring Boot application.

## `PersonController.java`

This class defines the RESTful API endpoints for handling person-related operations such as adding, retrieving, updating, and deleting persons.

## `FakePersonAccessService.java`

This class serves as a fake data access service implementing the `PersonDao` interface. It provides methods for interacting with the data source, such as inserting, selecting, updating, and deleting person records.

## `Person.java`

The `Person.java` class represents the model for a person object. It contains properties such as `id` and `name`, along with getter methods.

## `PersonService.java`

This service class contains business logic related to person data manipulation. It interacts with the data access layer (`PersonDao`) to perform CRUD operations on person records.

## `FirstApiWithSpringApplication.java`

This is the main class of the Spring Boot application. It contains the `main` method to run the application.

## Prerequisites

- JDK (Java Development Kit)
- Maven
- Spring Boot
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Setup

1. Clone the repository.
2. Open the project in your preferred IDE.
3. Build the project using Maven.
4. Run the `FirstApiWithSpringApplication.java` file to start the application.

## Usage

After setting up the project, you can use the API endpoints defined in `PersonController.java` to perform CRUD operations on person data. I personally tested it on postman.

