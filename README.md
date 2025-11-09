# 🛍️ E-Commerce Fullstack Project

A complete full-stack **E-commerce web application** built using **React (Vite)** and **Spring Boot**.  
It allows users to browse products, add to cart, and manage their purchases — while the admin can add or update products.  
This project demonstrates seamless **frontend-backend integration**, **RESTful APIs**, and a **modern UI** — ideal for production-level systems.

---

## 🚀 Tech Stack

### 💻 Frontend
- ⚛️ **React (Vite)**
- 🧭 **React Router DOM**
- 📦 **Axios** for API calls
- 🎨 **Tailwind CSS** (or custom CSS)
- 🌗 **Dark/Light Mode Toggle**

### ⚙️ Backend
- ☕ **Spring Boot**
- 🧩 **Spring MVC**
- 🗃️ **Hibernate / JPA**
- 💾 **H2 Database** (in-memory)
- 🔐 **REST API Endpoints**

---

## 🗂️ Project Structure

ecommerce-fullstack/
│
├── frontend/ # React application (UI + API calls)
│ ├── src/
│ ├── public/
│ ├── package.json
│ └── vite.config.js
│
└── backend/ # Spring Boot application
├── src/main/java/com/example/WebProjects/
├── src/main/resources/
├── pom.xml
└── application.properties

---

## ⚡ Features

✅ Modern responsive UI  
✅ Product listing and dynamic cart management  
✅ Add, update, and delete products (admin functionality)  
✅ RESTful APIs built with Spring Boot  
✅ Integrated H2 database  
✅ Axios-based communication between frontend & backend  
✅ Dark/Light theme toggle  

---

## 🧩 How to Run Locally

### 🖥️ Backend (Spring Boot)
```bash
cd backend
mvn spring-boot:run
The backend will start at 👉 http://localhost:8080
The frontend will start at 👉 http://localhost:5173

GET	/api/products	Get all products
POST	/api/products	Add new product
PUT	/api/products/{id}	Update product by ID
DELETE	/api/products/{id}	Delete product by ID

Setup Notes

Backend uses H2 in-memory DB (auto-resets each run)

Update application.properties if switching to MySQL or PostgreSQL

Ensure both frontend and backend servers are running for full functionality
🧑‍💻 Author

Prachi Tiwari
📧 prachitiwari0405@gmail.com

🪶 License

This project is open-source and available under the MIT License.
