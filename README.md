# 🌐 Web Applications Using Servlets and JSP

### 💻 PBLJ 8th Experiment: Web Applications Using Servlets and JSP for User Input Handling and Database Integration

---

## 🧩 Folder Structure
```text
PBLJ8_WebApp/
│
├── index.html
├── attendance.jsp
├── viewAttendance.jsp
│
├── WEB-INF/
│ ├── web.xml
│ └── classes/
│ ├── LoginServlet.java
│ ├── EmployeeServlet.java
│ └── AttendanceServlet.java
│
└── README.md
```
---

## 🔧 Overview

This project demonstrates user input handling and database integration using **Java Servlets**, **JSP**, and **MySQL**.

It contains **three parts**, each focusing on different servlet and JSP concepts.

---

## 🧠 Part A: User Login Using Servlet and HTML Form

### 🎯 Objective
To develop a Java Servlet that accepts user credentials through an HTML form and displays a personalized welcome message upon successful login.

### 🧾 Explanation
This part demonstrates:
- Form submission using **HTML**
- Request handling in **Servlet**
- Dynamic response generation using **PrintWriter**

### ⚙️ Steps
1. Create an HTML form to capture username and password.  
2. On submission, form sends data to a Servlet using `POST`.  
3. The Servlet:
   - Retrieves input via `request.getParameter()`
   - Validates credentials (hardcoded or DB)
   - Displays personalized message if valid, error if invalid

---

## 🧠 Part B: Display Employee Records with JDBC and Servlet Integration

### 🎯 Objective
To create a Java Servlet that integrates with a database using **JDBC** and displays a list of employees. It also allows searching employee details by ID.

### 🧾 Explanation
This part demonstrates:
- **JDBC integration** with Servlets  
- **Dynamic HTML generation** using Java  
- **Search feature** with database query filtering  

### ⚙️ Steps
1. Set up `Employee` table with fields like EmpID, Name, Department, and Salary.  
2. Create a Servlet that:
   - Connects to MySQL database  
   - Executes query to fetch employee records  
   - Displays data in an HTML table  

---

## 🧠 Part C: Student Attendance Portal Using JSP and Servlet

### 🎯 Objective
To develop a simple **Student Attendance Portal** using **JSP** for frontend and **Servlet** for backend form processing and database integration.

### 🧾 Explanation
This part demonstrates:
- **Separation of View (JSP)** and **Controller (Servlet)**  
- End-to-end form submission and database insertion  
- Real-time data handling via JSP and JDBC  

### ⚙️ Steps
1. Create a JSP page to collect attendance (Name, Status).  
2. Form submits to Servlet using `POST`.  
3. The Servlet inserts data into the `attendance` table.  
4. Another JSP (`viewAttendance.jsp`) displays all attendance records.

---

## 🧰 Technologies Used
- **Java Servlets (Jakarta)**
- **JSP (JavaServer Pages)**
- **JDBC (MySQL Connectivity)**
- **Apache Tomcat Server**
- **HTML / CSS (Frontend)**

---

## ⚙️ Database Setup (MySQL)

Run these commands before starting the server:

```sql
CREATE DATABASE college;
USE college;

CREATE TABLE employees (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  department VARCHAR(50),
  salary DOUBLE
);

INSERT INTO employees (name, department, salary)
VALUES ('Alice', 'HR', 35000),
       ('Bob', 'IT', 50000),
       ('Carol', 'Finance', 40000);

CREATE TABLE attendance (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  status VARCHAR(20)
);
