# Inventory Management System (Spring Boot)

A modern inventory management system built with Spring Boot 3.4.2, Java 21, and Spring Security with JWT.

## High-Level Setup

### 1. Prerequisites
*   Docker and Docker Compose installed.
*   Java 21 and Maven (if running locally).

### 2. Running with Docker (Quickest)
The project is fully dockerized with a multi-stage build.
```bash
docker compose up --build
```
*   **API URL**: `http://localhost:8081`
*   **Database (MySQL)**: `localhost:3307` (Root: `root`, Password: `egxduvwz`)

### 3. Running Locally
1.  **Database**: Ensure a MySQL instance is running.
2.  **Configure**: Update `src/main/resources/application.properties` or set environment variables (`DB_HOST`, `DB_USER`, etc.).
3.  **Build & Run**:
    ```bash
    ./mvnw clean spring-boot:run
    ```

### 4. Authentication
*   **Register**: `POST /auth/register` (Send User JSON)
*   **Login**: `POST /auth/login` (Returns JWT token)
*   **Secure API**: Add `Authorization: Bearer <token>` to your headers.

---
*Upgraded to Spring Boot 3 & Java 21 by Antigravity AI.*
