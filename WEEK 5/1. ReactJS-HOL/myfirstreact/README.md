# Week 5 - ReactJS Hands-On Lab 1: `myfirstreact`

This project is created as part of **Week 5 - Hands-On Exercise 1: React Fundamentals**.

---

## 🎯 Lab Objectives & Concepts

### 1️⃣ Single Page Application (SPA) & Benefits
- **Definition:** A Single-Page Application (SPA) is a web application or website that interacts with the user by dynamically rewriting the current web page with new data from the web server, rather than loading entire new pages from a server.
- **Key Benefits:**
  - **Fast Performance:** Once loaded, only necessary data is transferred over the wire (via JSON APIs).
  - **Rich User Experience:** Smooth transitions without screen flickering or full-page reloads.
  - **Code Reusability:** Shared components across multiple views.

### 2️⃣ SPA vs Multi-Page Application (MPA)
| Feature | Single-Page Application (SPA) | Multi-Page Application (MPA) |
| :--- | :--- | :--- |
| **Page Reloads** | None (dynamic content rendering) | Full page reloads on every navigation |
| **User Experience** | Fluid, app-like feeling | Classical web browsing experience |
| **Development** | Reusable component-based architecture | Server-rendered templates |
| **SEO** | Requires Client/Server-Side Rendering setup | Built-in SEO friendly out of the box |

### 3️⃣ What is React & Virtual DOM?
- **React:** A declarative, efficient, and flexible JavaScript library created by Facebook (Meta) for building user interfaces, primarily component-based SPAs.
- **Virtual DOM:** A lightweight, in-memory representation of the real DOM. When component state changes:
  1. React creates a new Virtual DOM tree.
  2. It performs a **diffing algorithm** comparing the new tree with the previous snapshot.
  3. React updates **only the changed nodes** in the real DOM (Reconciliation), ensuring optimal browser performance.

### 4️⃣ Key Features of React
- **JSX (JavaScript XML):** Syntax extension allowing HTML-like templates inside JavaScript.
- **Component-Based Architecture:** Modular, self-contained UI blocks.
- **One-Way Data Binding:** Unidirectional data flow from parent to child components.
- **Virtual DOM:** Fast and targeted rendering updates.

---

## 🚀 How to Run `myfirstreact`

### Step 1: Install Dependencies
Open your terminal inside the `myfirstreact` directory and run:
```bash
npm install
```

### Step 2: Start Development Server
```bash
npm start
```

### Step 3: Open in Browser
Access the running application at:
`http://localhost:3000`

---

## 📄 Rendered Output

The home page renders the required heading:
```html
<h1>welcome to the first session of React</h1>
```
