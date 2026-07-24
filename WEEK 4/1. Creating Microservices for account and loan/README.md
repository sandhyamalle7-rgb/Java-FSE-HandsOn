# Project 1: Creating Microservices for Account and Loan

This project contains two independent Spring Boot REST microservices created as part of **Week 4 - Hands-On Exercise 1**:
1. **`account-service`** - Manages customer bank accounts.
2. **`loan-service`** - Manages customer loans.

---

## 🏗️ Project Components

| Microservice | Port | Database | Responsibilities |
| :--- | :--- | :--- | :--- |
| **`account-service`** | `8081` | H2 In-Memory | REST endpoints for account creation, retrieval, and updates |
| **`loan-service`** | `8082` | H2 In-Memory | REST endpoints for loan applications, retrieval, and status |

---

## 🚀 How to Run the Microservices

### 1️⃣ Start Account Service
```bash
cd account-service
mvn spring-boot:run
```
> Running on `http://localhost:8081`

### 2️⃣ Start Loan Service
```bash
cd loan-service
mvn spring-boot:run
```
> Running on `http://localhost:8082`

---

## 🌐 REST API Endpoints & Testing

### 💳 Account Service (`http://localhost:8081`)
- **GET All Accounts:** `GET http://localhost:8081/accounts`
- **GET Account by Number:** `GET http://localhost:8081/accounts/ACC1001`
- **POST Create Account:** `POST http://localhost:8081/accounts`

**Sample POST Request Body:**
```json
{
  "accountNumber": "ACC1003",
  "customerName": "Robert Downey",
  "accountType": "Savings",
  "balance": 15000.00
}
```

---

### 🏦 Loan Service (`http://localhost:8082`)
- **GET All Loans:** `GET http://localhost:8082/loans`
- **GET Loan by Number:** `GET http://localhost:8082/loans/LN5001`
- **POST Create Loan:** `POST http://localhost:8082/loans`

**Sample POST Request Body:**
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
