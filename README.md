# Student CRUD REST API

A Spring Boot RESTful API for managing students with full CRUD functionality.  
This project follows a clean layered architecture using **Controller → Service → Repository**.

---

## 🚀 Features

- Create a new student
- Get all students
- Get student by ID
- Update student details
- Delete a student
- Input validation using Jakarta Validation
- Global exception handling

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate
- Maven
- REST API
- Git & GitHub

---

## 🧱 Project Architecture

controller → handles HTTP requests
service → business logic
repository → database access
model → entity classes
exception → custom & global exception handling


---

## 📌 API Endpoints

| Method | Endpoint           | Description          |
|------|-------------------|---------------------|
| POST | /students          | Add a new student   |
| GET  | /students          | Get all students    |
| GET  | /students/{id}     | Get student by ID   |
| PUT  | /students/{id}     | Update student      |
| DELETE | /students/{id}   | Delete student      |

## 🗄️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE studentdb;

---

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

---

## ▶️ How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/PranavMaheshwari37/StudentCrudDB.git

2. Navigate to the project directory
   cd StudentCrudDB

3. Run the application
   mvn spring-boot:run

4. Test APIs using Postman or browser
   
---

📈 **Future Improvements**

1. Add DTOs and Model Mapper
2. Pagination and sorting
3. Authentication using Spring Security
4. Unit and integration testing

---

👤 **Author**
Pranav Maheshwari
Java | Spring Boot | Backend Development
GitHub: https://github.com/PranavMaheshwari37

---
