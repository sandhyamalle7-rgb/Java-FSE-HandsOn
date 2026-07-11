# DJava-FSE-HandsOn Workspace Guide

## Overview
This is a **Full-Stack Engineering (FSE) hands-on training workspace** containing a mix of:
- A Maven-based Java project (`demo/`) for building and testing
- Course materials and exercises (`WEEK 1/`) covering design patterns, TDD, and DSA

## Workspace Structure

### `/demo` - Main Maven Project
- **Purpose**: Template Java project with testing infrastructure
- **Build System**: Maven
- **Java Version**: 17
- **Key Dependencies**:
  - JUnit 5.10.2 (testing framework)
  - Mockito 5.12.0 (mocking library)
- **Build Command**: `mvn clean install` or `mvn test`
- **Source Layout**:
  - `src/main/java/com/example/` - Application code
  - `src/test/java/` - Test files
  - `target/` - Build outputs (auto-generated)

### `/WEEK 1` - Educational Materials & Exercises
Organized by topic:
- **3 PLSQL/** - SQL/PL-SQL exercises
- **4 TDD using JUnit5 and Mockito/** - Testing best practices
  - `JUnit_Basic_Testing_Exercises/` - Basic assertions and test structure
  - `Mockito-Exercises/` - Mocking and stubbing patterns
- **DSA/** - Data structures and algorithms implementations
  - `EcommerceSearch/` - Product search examples
  - `FinancialForecasting/` - Forecasting algorithms
- **Exercise-1-Singleton-Pattern/** - Creational design pattern examples
- **Exercise-2-Factory-Method/** - Creational design pattern examples

## Common Tasks

### Running Tests
```bash
cd demo
mvn test
```

### Compiling Code
```bash
cd demo
mvn compile
```

### Working with Course Materials
- Each exercise folder contains standalone examples (no Maven dependency)
- Compile individual Java files:
  ```bash
  javac WEEK\ 1/Exercise-1-Singleton-Pattern/*.java
  java -cp WEEK\ 1/Exercise-1-Singleton-Pattern Main
  ```

## Code Conventions

### Exercise Files
- **Naming**: PascalCase for classes, snake_case for exercise folders
- **Structure**: Usually simple, focused on demonstrating a single concept
- **Examples**: `Exercise1_Setting_Up_JUnit.java`, `Exercise3_Assertions_In_JUnit.java`

### Java Code Style
- Java 17 features are acceptable
- Use proper package declarations (`com.example.*`)
- Follow standard getter/setter patterns for POJOs
- Test files use JUnit 5 annotations (`@Test`, `@BeforeEach`, `@AfterEach`)

### Testing Standards
- **Framework**: JUnit 5 with Mockito for mocking
- **Pattern**: AAA pattern (Arrange, Act, Assert)
- **Scope**: Both unit tests and integration test examples in exercises

## Focusing on Compact Folders

When working across this workspace:
- **Separate concerns**: Demo project = development work; WEEK 1 = educational reference
- **Cross-reference**: Design patterns in WEEK 1 inform implementations in demo/
- **Navigation**: Always clarify which folder context (demo/ vs WEEK 1/) when assisting with code changes

## Quick Checks

| Task | Command |
|------|---------|
| Build demo project | `mvn -f demo/pom.xml clean install` |
| Run tests | `mvn -f demo/pom.xml test` |
| Check Maven version | `mvn -v` |
| Compile single exercise | `javac "WEEK 1/Exercise-*/**.java"` |

## Notes for AI Agents
- The workspace is educational; prioritize clarity and comments in explanations
- Course materials in WEEK 1 are self-contained; avoid forcing Maven patterns on them
- When suggesting improvements, consider both demo/ (production mindset) and WEEK 1/ (learning mindset) contexts
