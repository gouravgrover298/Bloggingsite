document.addEventListener("DOMContentLoaded", function() {
    console.log("Welcome to the Blogging Site!");

    // Handle Login Form Submission
    const loginButton = document.getElementById("loginButton");
    const loginForm = document.getElementById("loginForm");

    if (loginButton && loginForm) {
        loginForm.addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent the form from submitting the default way
            
            const username = document.getElementById("username").value;
            const password = document.getElementById("password").value;

            // Make the API request to log in
            fetch('/auth/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ username: username, password: password })
            })
            .then(response => response.json())
            .then(data => {
                if (data.token) {
                    // Store the JWT token in localStorage or sessionStorage
                    localStorage.setItem('authToken', data.token);
                    alert('Login successful!');
                    window.location.href = '/home'; // Redirect to home page after login
                } else {
                    alert('Invalid username or password');
                }
            })
            .catch(error => {
                console.error('Error during login:', error);
                alert('An error occurred during login');
            });
        });
    }

    // Handle Registration Form Submission
    const registerForm = document.getElementById("registerForm");
    if (registerForm) {
        registerForm.addEventListener("submit", function(event) {
            event.preventDefault();

            const username = document.getElementById("registerUsername").value;
            const password = document.getElementById("registerPassword").value;

            // Make the API request to register
            fetch('/auth/register', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ username: username, password: password })
            })
            .then(response => response.json())
            .then(data => {
                if (data.message === "User registered successfully") {
                    alert('Registration successful! You can now log in.');
                    window.location.href = '/login'; // Redirect to login page after successful registration
                } else {
                    alert('Registration failed: ' + data.message);
                }
            })
            .catch(error => {
                console.error('Error during registration:', error);
                alert('An error occurred during registration');
            });
        });
    }

    // Mobile Menu Toggle
    const menuToggle = document.getElementById("menuToggle");
    const navMenu = document.getElementById("navMenu");

    if (menuToggle) {
        menuToggle.addEventListener("click", function() {
            navMenu.classList.toggle("active");
        });
    }
});
