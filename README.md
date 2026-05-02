# 🏥 Hospital Patient Record System (Java + MySQL)

## 📌 Project Overview

The **Hospital Patient Record System** is a console-based Java application designed to manage patient information efficiently in a hospital environment.
It allows users to add, view, and update patient records using a MySQL database.

---

## 🚀 Features

* ➕ Add new patient records
* 📋 View all patient details
* ✏️ Update patient diagnosis and treatment
* 🔐 Secure database access using Prepared Statements
* 💾 MySQL database integration

---

## 🛠️ Technologies Used

* Java (JDK 8 or above)
* MySQL Database
* JDBC (Java Database Connectivity)
* MySQL Connector/J (JAR file)

---

## 🗄️ Database Setup

```sql
CREATE DATABASE hospital_db;

USE hospital_db;

CREATE TABLE patients (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    gender VARCHAR(10),
    diagnosis TEXT,
    treatment TEXT
);
```

---

## 📂 Project Structure

```
Hospital-Patient-System/
│
├── DBConnection.java
├── HospitalSystem.java
├── mysql-connector-j-8.0.xx.jar
└── README.md
```

---


## 🖥️ Sample Output

```
===== Hospital Patient Record System =====
1. Add Patient
2. View Patients
3. Update Medical History
4. Exit
Enter choice:
```

---

## 🔐 Security Features

* Uses Prepared Statements to prevent SQL Injection
* Secure database connection handling
* No hardcoded SQL queries with user input


## 📈 Future Enhancements

* GUI using Java Swing / JavaFX
* User authentication system
* Role-based access (Admin/Doctor)
* Patient search functionality
* Data export (PDF/Excel)

---

## 👨‍💻 Author

Your Name

Hema Polasri
---

## 📜 Licens
