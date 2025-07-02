import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/STUDENT_1";
        String username = "root";
        String password = "08102004g@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT_1");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("studID") +
                                   ", Name: " + rs.getString("name") +
                                   ", RollNo: " + rs.getInt("roll"));
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
