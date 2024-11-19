Blogging-site/

├── backend/

│   ├── src/

│   │   ├── main/

│   │   │   ├── java/

│   │   │   │   └── com/

│   │   │   │       └── example/

│   │   │   │           └── blog/

│   │   │   │               ├── BloggingSiteApplication.java       // Main Spring Boot application

│   │   │   │               ├── controller/

│   │   │   │               │   ├── AuthController.java           // Handles user authentication

│   │   │   │               │   ├── BlogController.java           // Handles blog operations

│   │   │   │               │   └── ReportController.java         // Handles report generation

│   │   │   │               ├── model/

│   │   │   │               │   ├── User.java                     // User entity

│   │   │   │               │   └── Blog.java                     // Blog entity

│   │   │   │               ├── repository/

│   │   │   │               │   ├── UserRepository.java           // User repository interface

│   │   │   │               │   └── BlogRepository.java           // Blog repository interface

│   │   │   │               ├── service/

│   │   │   │               │   ├── UserService.java              // User service logic

│   │   │   │               │   ├── BlogService.java              // Blog service logic

│   │   │   │               │   └── ReportService.java            // Report service logic

│   │   │   │               └── config/

│   │   │   │                   └── SecurityConfig.java            // Security configuration (if needed)

│   │   │   └── resources/

│   │   │       ├── application.properties                         // Application properties

│   │   │       └── static/

│   │   │           ├── css/

│   │   │           │   └── styles.css                           // CSS styles

│   │   │           ├── js/

│   │   │           │   └── app.js                               // JavaScript for frontend functionality

│   │   │           └── html/

│   │   │               ├── index.html                           // Main HTML file

│   │   │               ├── login.html                           // Login page

│   │   │               ├── dashboard.html                       // Dashboard page

│   │   │               ├── create-blog.html                     // Create blog page

│   │   │               ├── edit-blog.html                       // Edit blog page

│   │   │               └── report.html                          // Report page for frequent words


