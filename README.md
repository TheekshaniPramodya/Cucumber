# MySLT Portal Automation Suite

A professional Behavior-Driven Development (BDD) automation framework designed to verify the core navigation and functionality of the MySLT Self-care portal.

## 🚀 Project Overview
This project uses **Cucumber** and **Selenium WebDriver** to automate the end-to-end verification of 9 primary pages within the MySLT portal. The suite ensures that all critical sections are accessible and functional after portal updates.

### Key Features Verified:
* Broadband Summary & Usage History
* PEO TV Status & Package Details
* Billing Information & Total Payable
* Voice & Mobile Services
* Promotions & Data Rewards (Redeem)
* Complaints Management

## 🛠️ Technical Stack
* **Language:** Java 17
* **Framework:** Cucumber (BDD) with Gherkin syntax
* **Automation Tool:** Selenium WebDriver
* **Build Tool:** Apache Maven
* **Browser:** Google Chrome (Managed via WebDriverManager)

## 📊 Results & Evidence
The automation suite has been successfully executed with a **100% Pass Rate**.

* **Final Status:** `Process finished with exit code 0`
* **Execution Time:** ~1.5 minutes for full 9-page navigation.

### Report Generation
Cucumber HTML reports are automatically generated in the `target/` directory:
- `target/cucumber-reports.html`

## 📁 Project Structure
```text
src/
 ├── test/
 │    ├── java/
 │    │    ├── runners/        # TestRunner.java
 │    │    └── stepDefinition/ # LoginSteps.java (Selenium Logic)
 │    └── resources/
 │         └── features/      # 01_login.feature (Gherkin Scenarios)
 └── pom.xml                  # Maven Dependencies

 ⚙️ How to Run
Clone the repository.

Open in IntelliJ IDEA.

Ensure Maven dependencies are loaded.

Run the TestRunner.java class.
