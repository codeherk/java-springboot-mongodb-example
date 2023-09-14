# java-springboot-mongodb-example
Java Spring Boot API with MongoDB example

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Contributing](#contributing)

## Overview
Technologies used:
- Java: Object Oriented Programming Language
- Spring Boot: Java-based web framework for developing microservices
- MongoDB: NoSQL Database
- Maven: a project management tool

## Prerequisites

- Install Java 17 (OpenJDK 17.0.2)
    - [via Chocolately for Windows](https://community.chocolatey.org/packages/openjdk/17.0.2)
    - via Homebrew for Mac
- Install Maven

## Getting Started

- Clone repo
- Run `make start` at the top level directory to build and run the API

### Available Endpoints

| Method | Endpoint          | Description                                                   |
|--------|-------------------|---------------------------------------------------------------|
| GET    | `/api/tasks`      | Get all tasks (currently only available with genre parameter) |
| GET    | `/api/tasks/{id}` | Get task by ID                                                |

###  Request Example

`GET /api/movies`

    curl -i -H 'Accept: application/json' http://localhost:8080/api/movies?genre=Drama

## TODO

- Add additional endpoints
- Add unit tests
- Containerize API
- Deploy with GitHub Actions
- Add Swagger Doc

## Contributing

I appreciate feedback and contribution to this repo! Feel free to create a PR with your changes. I plan to add additional things like a PR template, etc. to make the contribution process more formal.  


