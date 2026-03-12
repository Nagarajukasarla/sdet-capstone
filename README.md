# WordPress Automation Testing (Selenium + Cucumber + TestNG)

This project is an automated UI testing framework built using **Java,
Selenium WebDriver, Cucumber (BDD), and TestNG**. It validates different
functionalities of the WordPress website using **Behavior Driven
Development (BDD)** principles.

The framework follows a **Page Object Model (POM)** structure to improve
maintainability, readability, and reusability.

------------------------------------------------------------------------

# Project Objective

The goal of this automation framework is to validate key workflows on
the WordPress website.

The framework tests:

1.  Launching the WordPress homepage and verifying the page title
2.  Navigating through the WordPress menu options
3.  Searching content in the Photo Directory
4.  Verifying search results are displayed correctly

------------------------------------------------------------------------

# Tech Stack

-   Language: Java
-   Automation Tool: Selenium WebDriver
-   BDD Framework: Cucumber
-   Test Runner: TestNG
-   Build Tool: Maven
-   Design Pattern: Page Object Model (POM)

------------------------------------------------------------------------

# Project Structure

    capstone
    │
    ├── src
    │   ├── main
    │   │   └── java
    │   │       ├── pages
    │   │       │   ├── WordPressPage.java
    │   │       │   ├── PhotoDirectoryPage.java
    │   │       │   └── HomePage.java
    │   │       │
    │   │       └── base
    │   │           └── DriverManager.java
    │   │
    │   └── test
    │       ├── java
    │       │   ├── stepdefinitions
    │       │   │   ├── CommonSteps.java
    │       │   │   ├── GetWordPressSteps.java
    │       │   │   ├── PhotoDirectorySteps.java
    │       │   │   └── VerifyWordPressSteps.java
    │       │   │
    │       │   ├── hooks
    │       │   │   └── Hooks.java
    │       │   │
    │       │   └── runners
    │       │       └── TestRunner.java
    │       │
    │       └── resources
    │           └── features
    │               └── wordpress.feature
    │
    ├── pom.xml
    ├── testng.xml
    └── README.md

------------------------------------------------------------------------

# Dependencies

Main dependencies used in the project:

-   Selenium WebDriver
-   Cucumber Java
-   Cucumber TestNG
-   TestNG
-   Maven

Dependencies are managed using the **pom.xml** file.

------------------------------------------------------------------------

# Test Scenarios

## 1 Verify WordPress Homepage Title

    Given the user launches the browser
    When the user navigates to "https://wordpress.org"
    Then the page title should be verified

------------------------------------------------------------------------

## 2 Navigate to Themes Page

    Given the user is on the WordPress homepage
    When the user mouse hovers on Download & Extend
    And clicks on Themes
    Then the Themes page should be displayed

------------------------------------------------------------------------

## 3 Search Themes

    Given the user is on the Themes page
    When the user searches for a theme
    Then the themes should be displayed with titles

------------------------------------------------------------------------

# Framework Components

## DriverManager

Responsible for managing the Selenium WebDriver instance.

Handles: - Browser initialization - WebDriver configuration - Driver
lifecycle management

------------------------------------------------------------------------

## Page Objects

The framework uses **Page Object Model (POM)**.

Examples:

**WordPressPage.java**

Handles interactions with:

-   Download & Extend menu
-   Themes option

------------------------------------------------------------------------

**PhotoDirectoryPage.java**

Handles:

-   Photo search
-   Search results verification

------------------------------------------------------------------------

## Step Definitions

Step definitions map the **Gherkin steps to Java code**.

Examples:

-   CommonSteps.java
-   GetWordPressSteps.java
-   PhotoDirectorySteps.java
-   VerifyWordPressSteps.java

------------------------------------------------------------------------

## Hooks

Hooks.java is responsible for:

-   Browser setup before scenario execution
-   Closing the browser after execution

------------------------------------------------------------------------

## Test Runner

TestRunner.java integrates:

-   Cucumber
-   TestNG

It executes the feature files.

------------------------------------------------------------------------

# How to Run the Project

## 1 Clone the Repository

    git clone https://github.com/Nagarajukasarla/sdet-capstone.git

## 2 Navigate to Project Folder

    cd sdet-capstone

## 3 Install Dependencies

    mvn clean install

## 4 Run Tests

Using Maven:

    mvn test

Or run using **TestNG XML**

    testng.xml

------------------------------------------------------------------------

# Key Features

-   BDD based automation using Cucumber
-   Page Object Model for maintainability
-   Selenium WebDriver for browser automation
-   TestNG for test execution
-   Maven dependency management
-   Modular and scalable structure

------------------------------------------------------------------------

# Future Improvements

-   Add reporting (Extent Reports / Allure)
-   Add parallel test execution
-   Add CI/CD integration (GitHub Actions / Jenkins)
-   Add cross browser testing
-   Implement data driven testing
