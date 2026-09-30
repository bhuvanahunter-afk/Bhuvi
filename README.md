# Student Management with MySQL Database

1. Run database.sql in MySQL.
2. Edit src/main/resources/application.properties and set YOUR_MYSQL_PASSWORD.
3. Use Java 17+ and Maven.
4. Run: mvn spring-boot:run
5. Open http://localhost:8080

Flow:
HTML form -> JavaScript fetch POST -> Spring Boot Controller -> JdbcTemplate/JDBC -> MySQL.
After saving, JavaScript calls GET /api/students, so the table is populated from the database.
Delete also removes the row from MySQL and refreshes the table.
