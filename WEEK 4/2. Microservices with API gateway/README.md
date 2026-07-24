# Project 2: Microservices with API Gateway & Eureka Discovery Server

This project implements a complete microservices architecture using **Spring Boot 3** and **Spring Cloud**, created as part of **Week 4 - Hands-On Exercise 2**.

It features:
1. **Eureka Discovery Server** - Service registry for dynamic instance discovery.
2. **API Gateway** - Central entry point routing requests to registered services.
3. **Account Service** & **Loan Service** - Microservices registered with Eureka Discovery Server.

---

## 🏗️ Architecture & Component Overview

```
                        ┌──────────────────────────────┐
                        │   Spring Cloud API Gateway   │
                        │        (Port: 8090)          │
                        └──────────────┬───────────────┘
                                       │
                ┌──────────────────────┴──────────────────────┐
                │                                             │
                ▼                                             ▼
     ┌─────────────────────┐                       ┌─────────────────────┐
     │   Account Service   │                       │    Loan Service     │
     │    (Port: 8081)     │                       │    (Port: 8082)     │
     └──────────┬──────────┘                       └──────────┬──────────┘
                │                                             │
                └──────────────────────┬──────────────────────┘
                                       │ Registers With
                                       ▼
                        ┌──────────────────────────────┐
                        │    Eureka Discovery Server   │
                        │        (Port: 8761)          │
                        └──────────────────────────────┘
```

| Component | Port | Spring Cloud Module | Registered Name | Description |
| :--- | :--- | :--- | :--- | :--- |
| **`eureka-server`** | `8761` | Netflix Eureka Server | N/A | Service Discovery Registry Dashboard |
| **`account-service`** | `8081` | Eureka Client | `ACCOUNT-SERVICE` | Account management microservice |
| **`loan-service`** | `8082` | Eureka Client | `LOAN-SERVICE` | Loan management microservice |
| **`api-gateway`** | `8090` | Spring Cloud Gateway | `API-GATEWAY` | Central API Gateway routing HTTP traffic |

---

## 🚀 Execution & Startup Order

To run the complete system, start the microservices in the following sequential order:

### 1️⃣ Step 1: Start Eureka Discovery Server
```bash
cd eureka-server
mvn spring-boot:run
```
> **Verification:** Access Eureka Dashboard at `http://localhost:8761`.

### 2️⃣ Step 2: Start Account Service
```bash
cd account-service
mvn spring-boot:run
```
> **Verification:** Check `http://localhost:8761` to confirm `ACCOUNT-SERVICE` appears under registered instances.

### 3️⃣ Step 3: Start Loan Service
```bash
cd loan-service
mvn spring-boot:run
```
> **Verification:** Check `http://localhost:8761` to confirm `LOAN-SERVICE` appears under registered instances.

### 4️⃣ Step 4: Start API Gateway
```bash
cd api-gateway
mvn spring-boot:run
```
> **Verification:** Check `http://localhost:8761` to confirm `API-GATEWAY` is registered.

---

## 🌐 API Gateway Testing (Port 8090)

All external clients interact with the system through the API Gateway at `http://localhost:8090`:

### Accounts via Gateway
- **GET All Accounts:** `GET http://localhost:8090/accounts`
- **GET Account by ID:** `GET http://localhost:8090/accounts/ACC1001`
- **POST Create Account:** `POST http://localhost:8090/accounts`

### Loans via Gateway
- **GET All Loans:** `GET http://localhost:8090/loans`
- **GET Loan by ID:** `GET http://localhost:8090/loans/LN5001`
- **POST Create Loan:** `POST http://localhost:8090/loans`
