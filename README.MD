# 🚀 Item Management REST API (Spring Boot)

RESTful backend application built using Spring Boot to manage a collection of items.  
This project demonstrates clean architecture, validation, exception handling, Swagger documentation, and production-ready API design.

---

## 📌 Project Overview

This application provides REST APIs to create and retrieve items using an in-memory data store.  
It follows industry best practices such as:

- Layered architecture (Controller → Service → Model)
- DTO-based responses
- Global Exception Handling
- Input Validation
- OpenAPI (Swagger) documentation

---

## 🛠 Tech Stack

- Java 21
- Spring Boot 3
- Spring Web
- Spring Validation
- Swagger / OpenAPI (springdoc)
- Lombok
- Maven

---

## ⚙️ How to Run the Application

```bash
git clone <https://github.com/perumalrajc1-eng/Item-Model.git>
cd Item-Model
mvnw.cmd spring-boot:run


Application will start at:
http://localhost:8080


Swagger API Documentation=>
http://localhost:8080/swagger-ui/index.html


API Endpoints

POST /api/items → Add new item
GET /api/items/{id} → Get item by ID


👨‍💻 Author
C.Perumalraj
Java Backend Developer
