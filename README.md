# Automating-Magento-E-commerce-Website

## Introduction

This project automates testing of a Magento e-commerce website using a powerful combination of tools:

### Selenium: 
    A widely used web automation framework for interacting with web elements.
### Page Object Model (POM): 
    A design pattern for organizing web page interactions into well-defined classes, promoting maintainability and reusability.
### Page Factory:
    An extension of POM in Selenium, simplifying element initialization and reducing code duplication.
### TestNG:    
    A flexible testing framework for creating and executing test cases with rich annotations and reporting features.
### Maven: 
    A project management tool for building, testing, and deploying Java applications, ensuring efficient dependency management.
### Allure Reporting: 
    A visual reporting framework that generates comprehensive HTML reports with detailed test execution information.
    
## Prerequisites

### Java Development Kit (JDK): 
    Ensure you have a compatible JDK version installed (download from https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html).
### Maven: 
    Download and install Maven from https://maven.apache.org/install.html.
### IDE: 
    An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse is recommended for code development.


## Project Setup

### 1. Create a Maven Project:

    Open a terminal or command prompt.
    
    Navigate to the desired directory where you want to create the project.

### 2. Run the following command, replacing com.yourcompany with your preferred package name:

    Bash
    mvn archetype:generate -DgroupId=com.yourcompany -DartifactId=magento-automation -Dpackage=com.yourcompany.tests
    Use code with caution.

### 3.Configure pom.xml:

    Open the generated pom.xml file in your text editor.
    
    Add the following dependencies within the <dependencies> section, updating versions as needed:
    
    XML
    <dependency>
        <groupId>org.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.6.0</version>
    </dependency>
    
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.6.0</version>
    </dependency>
    
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-testng</artifactId>
        <version>2.18.1</version>
    </dependency>
    
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-maven</artifactId>
        <version>2.18.1</version>
    </dependency>


### 4. Project Structure

    Organize your project with a clear directory structure:
    
    Magento-automation/
    ├── src/main/java/
    │   ├── com/yourcompany/
    │   │   ├── pages/
    │   │   │   ├── HomePage.java
    │   │   │   ├── LoginPage.java
    │   │   │   └── ProductPage.java
    │   │   ├── tests/
    │   │   │   ├── LoginTest.java
    │   │   │   └── ProductSearchTest.java
    │   │   └── utils/
    │   │       └── DriverUtils.java
    ├── src/test/java/
    │   └── com/yourcompany/
    │       └── allure/
    │           └── AllureListener.java
    ├── pom.xml
    ├── allure.properties (optional)
    └── allure results (generated after test execution)

### Implementation Steps

    1. Create Page Classes (POM):
    
    Define separate classes for each web page you interact with, extending Page or a custom base class.
    Use annotations like @FindBy and @FindBys from Selenium Page Factory to locate web elements on the page.
    Include methods for common page actions like login, product search, adding to cart, etc.
    Java
    package com.yourcompany.pages;
    
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;
    
    public class LoginPage {
    
        private WebDriver driver;
    
        @FindBy(id = "username")
        private WebElement username
