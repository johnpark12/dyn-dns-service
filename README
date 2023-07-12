# DNS Updater

DNS Updater is a RESTful API service developed using Spring Boot. This service is designed to manage and update DNS records. The project utilizes Docker for containerization and MySQL for persistent storage. Key features of the project include Spring MVC, Spring Security, JPA repositories, and modern DevOps practices.

## Features

- Secure endpoints using Spring Security
- Containerization using Docker
- MySQL as a persistence layer
- CRUD operations on DNS records

## Prerequisites

- JDK 11 or newer
- Maven
- Docker
- MySQL Server running on localhost:3306

## Building and Running

To build and run the project, execute the following commands in the project's root directory:

```bash
mvn clean install
docker build -t dnsupdater .
docker run -e "SPRING_PROFILES_ACTIVE=docker" -p 8080:8080 dnsupdater
```

Please ensure that a MySQL server with a database named "dnsmap" is running on `localhost:3306` before you start the docker container.

You can then access the API at `http://localhost:8080`.

## Endpoints (In Progress)

- `GET /test`: Returns "API is working!" to confirm the API is up and running.
- `GET /all`: Returns all subdomains in the database.
- `POST /add`: Adds a new subdomain to the database. Requires the name and IP as parameters.

## To-Do

- [x] Stage 1: Setup Spring Boot project and MySQL integration.
- [x] Stage 2: Define Subdomain entity and create Subdomain Repository.
- [ ] Stage 3: Incorporate JWT for secure API endpoints.
- [ ] Stage 4: Integrate with Route 53 to update subdomain DNS records.
- [ ] Stage 5: Finalize API endpoints and run tests.

## Contribution

Feel free to submit a pull request if you want to contribute to this project. Make sure to include relevant unit tests for any new features or changes.

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.