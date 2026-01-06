# Global Supply Chain Order Tracking System

A Spring Boot–based backend application designed to manage and track global supply chain orders.  
This project models real-world logistics workflows similar to enterprise systems used in large-scale delivery and clearance platforms.

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- REST APIs
- H2 Database (for development)
- Maven
- Git & GitHub

## Key Features
- Create and manage supply chain orders
- Track order lifecycle with status transitions:
  - CREATED → IN_TRANSIT → CLEARED → DELIVERED
- RESTful APIs for order operations
- Global exception handling with meaningful HTTP responses
- Clean layered architecture (Controller, Repository, Model)
- Ready for cloud deployment and database migration

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /orders | Create a new order |
| GET    | /orders | Fetch all orders |
| GET    | /orders/{trackingNumber} | Track order by tracking number |
| PUT    | /orders/{id}/status | Update order status ||

## How to Run
1. Clone the repository
2. Import as **Existing Maven Project** in Eclipse
3. Run the Spring Boot application
4. Access APIs at `http://localhost:8080`

## Learning Outcomes
- Built production-style REST APIs using Spring Boot
- Designed domain models with workflow-driven state transitions
- Implemented global exception handling
- Practiced Git-based version control and clean commit history

## Author
Dasineni Vidyashree
