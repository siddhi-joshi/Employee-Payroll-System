# 💼 Employee Payroll System (Java)

## 📌 Project Overview

The **Employee Payroll System** is a **Java-based console application** designed to calculate employee salaries, apply tax deductions, and generate payslips.  
It demonstrates **core Java concepts**, **Object-Oriented Programming (OOP)** principles, and **clean class design**.

This project supports multiple employee types and uses **interfaces and polymorphism** to make the system scalable and maintainable.

---

## 🎯 Features

- ✅ Calculate employee salary
    
- ✅ Automatic tax deduction
    
- ✅ Generate detailed payslip
    
- ✅ Supports Full-Time and Part-Time employees
    
- ✅ Clean and modular code structure
    

---

## 🧠 Concepts Used

- Interfaces
    
- Polymorphism
    
- Abstraction
    
- Encapsulation
    
- OOP-based design
    
- Console-based user interaction
    

---

## 🛠️ Technologies Used

- **Language:** Java
    
- **Type:** Console Application
    
- **JDK:** Java 8 or above
    

---

## 📁 Project Structure

`EmployeePayrollSystem/ 
  ├── Employee.java 
  ├── PayrollCalculator.java 
  ├── FullTimeEmployee.java 
  ├── PartTimeEmployee.java 
  ├── PayrollService.java 
  └── Main.java`

---

## 🧩 Module Description

### 🔹 Employee Interface

Defines common behavior for all employee types.

### 🔹 PayrollCalculator Interface

Handles tax calculation logic.

### 🔹 FullTimeEmployee & PartTimeEmployee

Implements salary calculation using polymorphism.

### 🔹 PayrollService

Calculates tax and generates payslip.

### 🔹 Main Class

Acts as the entry point and handles user input.

---

## ▶️ How to Run the Project

### 📌 Using Command Line

1. Clone or download the project
    
2. Open terminal inside the project folder
    
3. Compile all files:
    
    `javac *.java`
    
4. Run the program:
    
    `java Main`
    

### 📌 Using IDE (VS Code / IntelliJ / Eclipse)

1. Open the project folder
    
2. Run `Main.java`
    

---

## 🧪 Sample Output

`1. Full-Time Employee 2. Part-Time Employee Select Employee Type: 1  Enter ID: 101 Enter Name: Rahul Enter Monthly Salary: 50000  ----- PAYSLIP ----- Employee ID   : 101 Employee Name : Rahul Gross Salary  : ₹50000 Tax Deduction : ₹5000 Net Salary    : ₹45000 -------------------`

---

## 🚀 Future Enhancements

- Store employee data using files or database
    
- Support multiple employees using collections
    
- Add different tax slabs
    
- Generate PDF payslips
    

- Convert to GUI or Spring Boot application
