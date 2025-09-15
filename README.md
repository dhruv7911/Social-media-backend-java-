# Social Media MVC Web Application

A Java-based social media platform built using the Model-View-Controller (MVC) architecture with Java Servlets, JSP, and MySQL database.

## 📋 Table of Contents

- [Features](#features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- **User Authentication**
  - User registration and login
  - Password encryption using hashing algorithms
  - Session management

- **Core Social Media Functionality**
  - Create, read, update, and delete posts
  - User profiles
  - Friend connections
  - Timeline/feed view
  - Like and comment system

- **Security Features**
  - Input validation
  - SQL injection prevention
  - Cross-site scripting (XSS) protection

## 🛠 Technology Stack

### Backend
- **Java 11+** - Core programming language
- **Java Servlets** - Web application framework
- **JDBC** - Database connectivity
- **MySQL** - Relational database
- **Maven** - Dependency management and build tool

### Frontend
- **HTML5** - Markup language
- **CSS3** - Styling
- **JavaScript** - Client-side scripting
- **Bootstrap** - UI framework (optional)

### Libraries & Dependencies
- **Gson** - JSON parsing
- **MySQL Connector/J** - MySQL database driver
- **Java Security API** - Password hashing and security

## 📁 Project Structure

```
social_media/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── social_media/
│       │               ├── controller/          # Servlet controllers
│       │               │   ├── Signup.java
│       │               │   ├── Login.java
│       │               │   ├── Post.java
│       │               │   └── Profile.java
│       │               ├── model/               # Data models
│       │               │   ├── User.java
│       │               │   ├── Post.java
│       │               │   └── Comment.java
│       │               ├── dao/                 # Data Access Objects
│       │               │   ├── UserDao.java
│       │               │   ├── PostDao.java
│       │               │   └── CommentDao.java
│       │               └── util/                # Utility classes
│       │                   └── DatabaseUtil.java
│       ├── resources/
│       │   └── database.properties
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           ├── css/
│           ├── js/
│           ├── images/
│           ├── index.jsp
│           ├── login.jsp
│           ├── signup.jsp
│           ├── dashboard.jsp
│           └── profile.jsp
├── target/                                      # Compiled classes
├── pom.xml                                      # Maven configuration
└── README.md
```

## 🔧 Prerequisites

Before running this application, make sure you have the following installed:

- **Java Development Kit (JDK) 11 or higher**
- **Apache Maven 3.6+**
- **MySQL 8.0+**
- **Apache Tomcat 9.0+** (or any servlet container)
- **Git** (for version control)

## 🚀 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/social-media-mvc-app.git
cd social-media-mvc-app
```

### 2. Configure Database

Create a MySQL database and user:

```sql
-- Create database
CREATE DATABASE social_media_db;

-- Create user (optional, for security)
CREATE USER 'social_media_user'@'localhost' IDENTIFIED BY 'your_password';
GRANT ALL PRIVILEGES ON social_media_db.* TO 'social_media_user'@'localhost';
FLUSH PRIVILEGES;
```

### 3. Create Database Tables

```sql
USE social_media_db;

-- Users table
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCR
