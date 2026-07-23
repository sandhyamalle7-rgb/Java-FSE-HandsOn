# Cognizant Java FSE HandsOn - Week 4: Microservices with Spring Boot 3 & Spring Cloud

This directory contains the complete solution for **Week 4 - Microservices with Spring Boot 3 & Spring Cloud**, focusing on:
1. **Creating Microservices for `account` and `loan`**
2. **Eureka Discovery Server** setup and registration
3. **Spring Cloud API Gateway** routing

---

## 🏗️ Architecture & Component Overview

| Microservice | Port | Description | Registered with Eureka |
| :--- | :--- | :--- | :--- |
| **`eureka-server`** | `8761` | Eureka Service Registry & Discovery Server | N/A (Server) |
| **`account-service`** | `8081` | Microservice managing bank accounts | Yes (`ACCOUNT-SERVICE`) |
| **`loan-service`** | `8082` | Microservice managing customer loans | Yes (`LOAN-SERVICE`) |
| **`api-gateway`** | `8090` | Spring Cloud Gateway routing requests dynamically | Yes (`API-GATEWAY`) |

---

## 🚀 Execution & Startup Order

### 1️⃣ Step 1: Start Eureka Discovery Server
Navigate to `eureka-server` and run:
```bash
cd eureka-server
mvn spring-boot:run
```
> **Verification:** Open `http://localhost:8761` in your browser. You should see the Eureka Discovery Dashboard.

### 2️⃣ Step 2: Start Account Microservice
In a new terminal:
```bash
cd account-service
mvn spring-boot:run
```
> **Verification:** Check `http://localhost:8761` to confirm `ACCOUNT-SERVICE` is registered.

### 3️⃣ Step 3: Start Loan Microservice
In a new terminal:
```bash
cd loan-service
mvn spring-boot:run
```
> **Verification:** Check `http://localhost:8761` to confirm `LOAN-SERVICE` is registered.

### 4️⃣ Step 4: Start API Gateway
In a new terminal:
```bash
cd api-gateway
mvn spring-boot:run
```
> **Verification:** Check `http://localhost:8761` to confirm `API-GATEWAY` is registered.

---

## 🌐 API Endpoint Testing

### Direct Service Testing
- **Accounts:** `GET http://localhost:8081/accounts`
- **Account by Number:** `GET http://localhost:8081/accounts/ACC1001`
- **Loans:** `GET http://localhost:8082/loans`
- **Loan by Number:** `GET http://localhost:8082/loans/LN5001`

### API Gateway Routing Testing (Port 8090)
- **Fetch Accounts via Gateway:** `GET http://localhost:8090/accounts`
- **Fetch Loans via Gateway:** `GET http://localhost:8090/loans`

---

## 📝 Sample JSON Payloads for POST Requests

### Create Account (`POST http://localhost:8090/accounts`)
```json
{
  "accountNumber": "ACC1003",
  "customerName": "Robert Downey",
  "accountType": "Savings",
  "balance": 15000.00
}
```

### Create Loan (`POST http://localhost:8090/loans`)
```json
{
  "loanNumber": "LN5003",
  "customerName": "Robert Downey",
  "loanType": "Personal Loan",
  "totalLoan": 50000.00,
  "amountPaid": 5000.00,
  "outstandingAmount": 45000.00
}
```
