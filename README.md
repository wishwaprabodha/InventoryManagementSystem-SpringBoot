# Inventory Management System (Spring Boot)

A modern inventory management system built with Spring Boot 3.4.2, Java 21, and Spring Security with JWT.

## High-Level Setup

### 1. Prerequisites
*   Docker and Docker Compose installed.
*   Java 21 and Maven (if running locally).

### 2. Running with Docker (Recommended)
This is the fastest way to get the system up and running with all dependencies (MySQL & App).

**To start the application:**
```bash
docker compose up -d --build
```

**Verify the application is running:**
```bash
docker logs -f inventory-app
```

**Access Points:**
*   **API URL**: `http://localhost:8081`
*   **Database (MySQL)**: `localhost:3307` (Credentials: `root` / `egxduvwz`)

**To stop the application:**
```bash
docker compose down
```

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


