# Employee Management System

A console-based Java application built to manage employee records in-memory using Object-Oriented Programming (OOP) principles.

---

## 📌 Features

- **Add Employee**: Register an employee with ID, name, department, and salary. Prevents duplicate IDs and negative salary values.
- **View All Employees**: Display formatted details of all stored employees.
- **Search Employee**: Look up an employee's profile by ID.
- **Update Employee**: Edit an existing employee's name, department, or salary.
- **Delete Employee**: Remove an employee record from the system by ID.

---

## 💡 OOP Concepts Demonstrated

- **Encapsulation**: The `Employee` class keeps data fields (`id`, `name`, `department`, `salary`) private, exposing them via public getter and setter methods with validation checks.
- **Collections Framework**: Uses `ArrayList<Employee>` for dynamic list operations (add, search, update, delete).
- **Console I/O & Validation**: Uses `java.util.Scanner` for interactive command-line inputs and handles edge cases like duplicate IDs and invalid salaries.

---

## 📁 Project Structure

```text
java internship/
├── EmployeeManagementApp.java   # Source code containing Employee and EmployeeManagementApp classes
└── README.md                    # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK 8 or higher) installed.
- Ensure `java` and `javac` commands are accessible in your terminal/command prompt.

### Compilation

Open your terminal in the project directory and run:

```bash
javac EmployeeManagementApp.java
```

### Running the Application

After compilation, launch the application:

```bash
java EmployeeManagementApp
```

---

## 📋 Menu Options

When launched, the program displays the following interactive menu:

```text
===== EMPLOYEE MANAGEMENT =====
1. Add Employee
2. View All Employees
3. Search Employee
4. Update Employee
5. Delete Employee
0. Exit
Enter your choice:
```
