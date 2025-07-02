import java.sql.*;

public class JDBCExamples {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "08102004g@";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connected to the database successfully!");
            dropTable(connection);
            createTable(connection);
            insertData(connection, 1, "John Doe", "john@example.com");
            insertData(connection, 2, "Jane Smith", "jane@example.com");
            insertData(connection, 3, "Sanket More", "sanket@example.com");
            insertData(connection, 4, "Nagesh", "nagesh@example.com");
            insertData(connection, 5, "Yash", "yash@example.com");

            retrieveData(connection);
            updateData(connection, 1, "john.doe@example.com");
            updateData(connection, 3, "sonali@example.com");
            deleteData(connection, 2);

            retrieveData(connection);

            System.out.println("Database operations completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void dropTable(Connection connection) throws SQLException {
        String dropSQL = "DROP TABLE IF EXISTS users";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(dropSQL);
            System.out.println("Dropped existing 'users' table.");
        }
    }
    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "email VARCHAR(100) UNIQUE)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'users' created successfully!");
        }
    }
    private static void insertData(Connection connection, int id, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + name);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Duplicate entry for ID: " + id + " or Email: " + email);
        }
    }
    private static void retrieveData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM users";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            System.out.println("\nCurrent Users:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email"));
            }
        }
    }
    private static void updateData(Connection connection, int id, String newEmail) throws SQLException {
        String updateSQL = "UPDATE users SET email = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Updated email for ID: " + id);
            } else {
                System.out.println("No user found with ID: " + id);
            }
        }
    }
        private static void deleteData(Connection connection, int id) throws SQLException {
            String deleteSQL = "DELETE FROM users WHERE id = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
             pstmt.setInt(1, id);
             int rowsDeleted = pstmt.executeUpdate();
             if (rowsDeleted > 0) {
                 System.out.println("Deleted user with ID: " + id);
             } else {
                 System.out.println("No user found with ID: " + id);
             }
         }
     }
}
