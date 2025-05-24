# Greeting Spring MVC Application

## Overview

This is a simple Spring MVC web application that displays a greeting message based on the time of day. It demonstrates basic use of Spring MVC with annotations, JSP views, and a DispatcherServlet configuration.

---

## Features

- Displays a welcome page.
- Shows a time-based greeting message: Good Morning, Good Afternoon, or Good Evening.
- Uses annotation-based Spring MVC controllers.
- JSP-based views resolved with `InternalResourceViewResolver`.

---

## Technologies Used

- Java 21
- Spring Framework 5.x (Spring MVC)
- Apache Tomcat 10.x (Servlet 4.0+)
- JSP / JSTL
- Maven (for dependency management)

---

## Project Structure
```properties
src/
└─ main/
├─ java/com/shreya/mvc/controller/GreetingMvcAppController.java
├─ webapp/
├─ WEB-INF/
├─ views/
├─ welcome.jsp
├─ greeting.jsp
├─ dispatcher-servlet.xml
├─ index.jsp
├─ web.xml
pom.xml
```

## Configuration

- **web.xml** configures the DispatcherServlet and maps it to `/`.
- **dispatcher-servlet.xml** enables component scanning for controllers and configures JSP view resolver.
- Controllers reside in `com.shreya.mvc.controller`.
- Views are JSP files located under `/WEB-INF/views/`.

---

## Running the Application

1. Build the project with Maven:

   ```bash
   mvn clean install
   ```

## 2. Deploy the generated WAR to Apache Tomcat server.
## 3.  Start Tomcat and open the browser:
   ```bash
        http://localhost:8080/greeting-mvc-app/
   ```
## 4. You will be redirected to the welcome page.

## 5. Click on "Take Greeting!" button to view a greeting message based on current time.

## Controller Endpoints
| URL         | Description                  |
| ----------- | ---------------------------- |
| `/`         | Redirects to `/welcome` page |
| `/welcome`  | Displays welcome page        |
| `/greeting` | Shows time-based greeting    |

## Notes
- Make sure Tomcat is running on port 8080 (or change the URL accordingly).

- JSP pages must be inside /WEB-INF/views/ to avoid direct access.

- The app uses Spring MVC's InternalResourceViewResolver for JSP rendering.
