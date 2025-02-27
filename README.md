# Learn Test Driven Development (TDD)

Welcome to the TDD learning module! This guide will help you understand the basics of Test Driven Development using Java and JUnit.

## How to Start

### Setting Up JUnit 5 in VS Code

1. **Install Java Extension Pack**: 
   - Make sure you have the Java Extension Pack installed in VS Code. You can find and install it from the Extensions view (`Ctrl+Shift+X`).

2. **Project Setup**:
   - Create a new folder for your project.
   - Inside the project folder, create a subfolder named `src`.
   - Within `src`, create two subfolders: `main` and `test`.
   - Your main Java classes will go in `src/main` and your test classes in `src/test`.

3. **Add JUnit 5 Dependency**:
   - If you're using Maven, add the JUnit 5 dependencies to your `pom.xml`.
     ```xml
     <dependency>
         <groupId>org.junit.jupiter</groupId>
         <artifactId>junit-jupiter-api</artifactId>
         <version>5.7.0</version>
         <scope>test</scope>
     </dependency>
     <dependency>
         <groupId>org.junit.jupiter</groupId>
         <artifactId>junit-jupiter-engine</artifactId>
         <version>5.7.0</version>
         <scope>test</scope>
     </dependency>
     ```
   - If you're using Gradle, add the following to your `build.gradle`:
     ```groovy
     testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
     testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
     ```

   - If you're using Gradle.kts, add the following to your `build.gradle`:
     ```groovy
     testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
     testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
     ```
     

4. **Create Your Test Class**:
   - Write your test cases using JUnit 5 annotations (`@Test`, `@BeforeEach`, etc.) in the `src/test` folder.
   - Ensure each test method tests a specific behavior of your code.

### Recommended IDEs

While this guide uses VS Code for simplicity, consider using dedicated IDEs for Java development such as:
- **IntelliJ IDEA Community Edition**
- **Eclipse**
- **NetBeans**

These IDEs provide powerful features like integrated debugging, intelligent code completion, and seamless integration with build tools like Maven and Gradle.

But if you are using **VS Code** Don't forget to check `How to Start` folder.

## TDD Basics

The `TDD-Basics` folder contains a basic calculator program. The goal is to practice writing test cases before implementing the functions. This approach helps you:
- Define clear requirements through tests.
- Write code that fulfills those requirements.
- Refactor code confidently while ensuring tests remain passing.

## Practice Questions

Explore the `TDD-Questions` folder for additional exercises to reinforce your understanding of TDD principles.
After practicing you can check the `Solutions` folder to find the Solutions of all Questions.

---

Start practicing TDD today to improve your code quality and development efficiency!

@Ashish-CodeJourney

