# 📊 Attendance-Driven Performance Monitoring Module for Staff in HRMS

This web-based application is developed as part of an internship project using **Spring Boot**, **Thymeleaf**, and **H2 Database**. It is designed to help HR professionals efficiently manage employee performance records through a clean, modular, and secure system.

---

## 📌 Project Overview

The **Employee Performance Management System** automates CRUD operations for performance records, replacing manual spreadsheet-based methods. It enhances accuracy, provides a better user experience, and ensures scalability and security through modular Spring Boot architecture.

---

## 💡 Features

- ✅ Create, View, Update & Delete (CRUD) performance records
- 🔒 Role-based authentication and authorization using Spring Security
- 📋 Thymeleaf-based dynamic web pages with Bootstrap for responsive UI
- 💾 Uses H2 in-memory database (can be switched to MySQL/PostgreSQL)
- 🔁 Follows Agile methodology with incremental delivery and testing

---

## ⚙️ Tech Stack

| Layer        | Technology           |
|--------------|----------------------|
| Frontend     | Thymeleaf, Bootstrap |
| Backend      | Spring Boot (Java 11+) |
| Architecture | MVC                  |
| Database     | H2 (Dev), MySQL/PostgreSQL (Prod-ready) |
| Security     | Spring Security      |

---

## 🧩 Modules

1. **User Interface Module** – Web pages using Thymeleaf
2. **Controller Module** – Request handling using Spring MVC
3. **Service Module** – Business logic & validations
4. **Repository Module** – Database operations via Spring Data JPA
5. **Security Module** – Handles login, role checks, and data protection

---

## 🗃️ Database Schema

### Tables:
- **Users**: `user_id`, `username`, `password`, `role`
- **Employee**: `employee_id`, `first_name`, `last_name`, `email`, `phone`, `department`, `position`
- **Performance Record**: `record_id`, `employee_id`, `date`, `score`, `comments`
- **Department**: `department_id`, `department_name`

---

## 🧪 Test Cases Summary

| Test Case                         |  Status  |
|----------------------------------|-----------|
| User login                       | ✅ Passed |
| Create performance record        | ✅ Passed |
| View performance record          | ✅ Passed |
| Update performance record        | ✅ Passed |
| Delete performance record        | ✅ Passed |

---

## Screenshots
![image](https://github.com/user-attachments/assets/ebdde81a-e706-4125-87a1-e985798d4e60)
![image](https://github.com/user-attachments/assets/0c480497-7419-4deb-b8ab-1069a6ae9d41)
![image](https://github.com/user-attachments/assets/a6a58e47-b226-48ca-9c19-a69001dd7140)
![image](https://github.com/user-attachments/assets/66c26ec3-5548-4185-8bbc-a46f253bdd94)

---

---

## 📈 Benefits

- 🔄 Real-time updates and record accuracy
- 👩‍💼 Better HR decision-making through performance insights
- 🔐 Role-based secure access
- 📊 Prepared for analytics and reporting extensions

---

## 🚀 Future Enhancements

- Role-based access levels (Admin, HR, Manager)
- Notification for performance reviews
- Integration with other HRMS modules
- Exportable reports with charts and analytics

---

## 🏢 Internship Details

- **Student**: Gowtham S 
- **Company**: Tripillar Solutions Pvt. Ltd., Bengaluru
- **Period**: 2024–2025 

---

## 📚 References

### Websites
- [Spring Framework](https://spring.io/projects/spring-framework)
- [Spring Security](https://spring.io/projects/spring-security)
- [Thymeleaf Docs](https://www.thymeleaf.org/documentation.html)

---

## 📜 License

This project is for academic and learning purposes only.

---

