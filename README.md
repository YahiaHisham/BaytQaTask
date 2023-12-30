# Bayt QA Test Automation Task

this project is to access my knowledge and abilities in test automation.
it includes 3 test cases
1. apply for a job and register a user account
2. login with the recent account and delete it
3. apply for a job in mobile view

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)


## Prerequisites

Ensure you have the following software installed:

- Java [latest version]

## Getting Started

1. Clone the repository.
2. Navigate to the project directory.
3. Install project dependencies using Maven and reload your maven xml file.
4. wait until all dependencies are resolved
5. run the project

## Project Structure

```plaintext
Bayt Task
│   README.md
│   pom.xml
│   testng.xml
│
└───src
    └───main
    │   └───java
    │       └───com.bayt
    │           └───common
    │           └───pages
    │
    └───test
        └───java
            └───com.bayt
                └───data [contains all required test data]
                └───testClasses [contains all test classes]
                └───utilities [contains all utilities that helps in executing the test cases]
