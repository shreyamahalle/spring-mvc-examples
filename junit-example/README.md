# 📦 JUnit Example Project

This is a simple Java project demonstrating **unit testing using JUnit 5**. The project uses **Maven** for dependency management and is developed using **IntelliJ IDEA**.

---

## 🚀 Tech Stack

- Java 21 
- Maven
- JUnit 5 (`junit-jupiter`)
- IntelliJ IDEA

---

## 📂 Project Structure
````
junit-example/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/example/
│ │ └── Calculator.java
│ └── test/
│ └── java/
│ └── com/example/
│ └── CalculatorTest.java
````

## 📄 Description

### `Calculator.java`

Contains basic arithmetic methods:

```java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
}

```
## CalculatorTest.java
Contains JUnit 5 test cases to verify the logic of Calculator.
```java
@Test
void testAdd() {
    assertEquals(8, calculator.add(5, 3));
}
```
##  How to Run Tests
📌 Make sure you have Java + Maven configured and IntelliJ installed.

## IntelliJ:
  1.Open the project in IntelliJ IDEA

  2.Right-click CalculatorTest.java

  3.Click Run 'CalculatorTest'

  4.✅ You should see Tests passed: 2 of 2
  
## CLI (Command Line):
````
mvn test
````
## 📦 Maven Dependency (JUnit 5)
```bash
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.10.0</version>
  <scope>test</scope>
</dependency>
```

## ✅ Benefits of Using JUnit
🚫 Catch bugs early

⚡ Fast automated testing

🔁 Easy regression checks

🧩 Integrates well with CI/CD

🧪 Supports test-driven development (TDD)


## 📌 Author
Shreya Mahalle
Java Developer | IntelliJ + Maven + JUnit Enthusiast