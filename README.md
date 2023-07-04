# Simple Spring Security App

This is a simple Spring Security application that provides login, sign up, and logout functionality.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven
- Git

## Getting Started

To get started with the application, follow these steps:

1. Clone the repository:

   \`\`\`bash
   git clone https://github.com/denomelchenko/spring-security-app.git
   \`\`\`

2. Navigate to the project directory:

   \`\`\`bash
   cd simple-spring-security-app
   \`\`\`

3. Build the application using Maven:

   \`\`\`bash
   mvn clean install
   \`\`\`

4. Run the application:

   \`\`\`bash
   mvn spring-boot:run
   \`\`\`

   The application will start running on \`http://localhost:8080\`.

## Usage

### Sign Up

1. Open your web browser and go to \`http://localhost:8080/auth/register`.
2. Fill out the sign-up form with your desired username and password.
3. Click the "Sign Up" button.

### Login

1. Open your web browser and go to http://localhost:8080/auth/login` or any other page.
2. Enter your username and password.
3. Click the "Log In" button.

### Logout

1. To log out, click the "Logout" link in the navigation bar.
2. You will be redirected to the login page.

## License

This project is licensed under the [MIT License](LICENSE).
