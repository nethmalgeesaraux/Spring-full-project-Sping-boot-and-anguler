# Student Management System - Backend API

A RESTful backend service for managing student information built with Spring Boot, following REST API best practices.

## 🚀 Features

- **Student CRUD Operations** - Create, Read, Update, Delete student records
- **RESTful API Design** - Clean, intuitive endpoints following REST conventions
- **Database Integration** - Persistent storage with MySQL/PostgreSQL/H2
- **Input Validation** - Request validation with proper error handling
- **Pagination & Sorting** - Efficient data retrieval for large datasets
- **Search Functionality** - Filter students by various criteria
- **Department Management** - Associate students with academic departments
- **Course Enrollment** - Manage student-course relationships
- **API Documentation** - Interactive API docs with Swagger/OpenAPI

## 🛠️ Tech Stack

- **Java 17+** - Programming language
- **Spring Boot 3.x** - Application framework
- **Spring Data JPA** - Database abstraction
- **MySQL/PostgreSQL** - Primary database (Production)
- **H2 Database** - In-memory database (Development/Testing)
- **Maven/Gradle** - Build tool
- **Lombok** - Reduced boilerplate code
- **Spring Boot Validation** - Request validation
- **Spring Boot Testing** - Unit and integration tests
- **Swagger/OpenAPI 3** - API documentation

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+ or Gradle 7+
- MySQL 8+ or PostgreSQL 14+ (optional for production)
- Git


```bash

📚 API Documentation
Once the application is running, access the API documentation:

Swagger UI: http://localhost:8080/swagger-ui.html

OpenAPI Docs: http://localhost:8080/v3/api-docs

🎯 API Endpoints
Student Management
Method	Endpoint	Description	Request Body
GET	/api/students	Get all students (with pagination)	-
GET	/api/students/{id}	Get student by ID	-
POST	/api/students	Create new student	Student JSON
PUT	/api/students/{id}	Update student	Student JSON
DELETE	/api/students/{id}	Delete student	-
GET	/api/students/search	Search students	Query parameters
Department Management
Method	Endpoint	Description
GET	/api/departments	Get all departments
POST	/api/departments	Create department
GET	/api/departments/{id}/students	Get students by department
Course Management
Method	Endpoint	Description
GET	/api/courses	Get all courses
POST	/api/courses/{courseId}/enroll/{studentId}	Enroll student in course


📁 Project Structure


student-backend/
├── .mvn/ # Maven wrapper files
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── net/school/student_backend/
│ │ │ ├── controller/ # REST Controllers
│ │ │ │ └── StudentController.java
│ │ │ ├── dto/ # Data Transfer Objects
│ │ │ │ └── StudentDto.java
│ │ │ ├── entity/ # JPA Entities
│ │ │ │ └── Student.java
│ │ │ ├── exception/ # Custom Exceptions
│ │ │ │ └── NotFound.java
│ │ │ ├── mapper/ # Object Mappers
│ │ │ │ └── StudentMapper.java
│ │ │ ├── repository/ # Data Access Layer
│ │ │ │ └── StudentRepository.java
│ │ │ └── service/ # Business Logic Layer
│ │ │ ├── StudentService.java # Interface
│ │ │ └── impl/ # Implementations
│ │ │ └── StudentImpl.java
│ │ └── resources/
│ │ ├── application.properties # Configuration
│ │ └── ... (other resources)
│ └── test/ # Test files
└── pom.xml # Maven dependencies
