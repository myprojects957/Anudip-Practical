import java.sql.*;
import java.util.Scanner;


public class Project {
    private static final String URL = "jdbc:mysql://localhost:3306/Project";
    private static final String USER = "root";
    private static final String PASSWORD = "08102004g@";

    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); 
        System.out.println("connected ");
        

        createTable(conn);
        Scanner sc  = new Scanner(System.in);
        int ch;
        do {
            System.out.println("--------------------------------------------MENU-----------------------------------");
            System.out.println("1 . ADD EMPLOYEE ");
            System.out.println("2 . VIEW TABLE ");
            System.out.println("3 . UPDATE TABLE ");
            System.out.println("4 . DELETE EMPLOYEE ");
            System.out.println("5 . SELECT VIA ID");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println();
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                int n ;
                System.out.println("Enter the number of employees to add : ");
                n = sc.nextInt();
                for(int i=0 ; i<n ; i++)
                {
                    System.out.print("enter emp_id : ");
                    int emp_id = sc.nextInt();
                    System.out.print("enter name : ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("enter email : ");
                    String email = sc.nextLine();
                    System.out.print("enter salary : ");
                    int salary = sc.nextInt();
                    insertData(conn,emp_id,name,email,salary);
                }
                break;
                
                case 2:
                retrieveData(conn);
                break ;
                
                case 3:
                int t ;
                System.out.println("Enter the number of employees to update : ");
                t = sc.nextInt();
            
                for(int i=0 ; i<t ; i++)
                {
                    System.out.print("enter emp_id to make changes to : ");
                    int id = sc.nextInt();
                    System.out.print("enter new_salary  : ");
                    int  new_salary = sc.nextInt();
                    updateData(conn,id, new_salary);
                }
                break;

                case 4:
                System.out.print("Enter : ");
                int id = sc.nextInt();
                deleteData(conn,id);
                break;

                case 5:
                System.out.print("Enter Emp ID : ");
                int emp_id = sc.nextInt();
                selectviaid(conn,emp_id);
                break;
                

            }

        } while (ch != 0);
        conn.close();
        System.out.println("database closed !");
        
    }
    catch(Exception e)
    { e.printStackTrace();}
    } 

    private static void createTable(Connection conn) throws SQLException{
        String createtablesql = "CREATE TABLE IF NOT EXISTS users (" 
            + "emp_id INT PRIMARY KEY,"
            + "name varchar(50),"
            + "email varchar(100)  UNIQUE,"
            + "salary INT "
            + ")";
        
        try(Statement stmt = conn.createStatement()){
            stmt.execute(createtablesql);
            System.out.println("Table User created succesfully !!");
        }
    } 

    private static void insertData(Connection conn ,int emp_id,String name , String email , int salary) throws SQLException{
        String insertdatasql = "INSERT INTO users (emp_id ,name,email,salary) VALUES (?,?,?,?)";
        try(PreparedStatement pstmt  = conn.prepareStatement(insertdatasql))
            {
                pstmt.setInt(1, emp_id);
                pstmt.setString(2, name);
                pstmt.setString(3, email);
                pstmt.setInt(4, salary);
                pstmt.executeUpdate();
                System.out.println("Inserted: " + name);
            }
        }

    private static void retrieveData(Connection conn) throws SQLException{
        String retrivedata = "SELECT * FROM users ";
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(retrivedata)){
                System.out.println( "Employee Data");
                while (rs.next()){
                    System.out.println("EMP_ID :" + rs.getInt("emp_id")+", Name : "+rs.getString("name")+", Email : "+ rs.getString("email")+", Salary :"+rs.getInt("salary"));
                }
            }
    }

    private static void updateData (Connection conn ,int id , int  new_salary) throws SQLException {
        String updatesql = "UPDATE users SET salary = ? WHERE emp_id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(updatesql)){
            pstmt.setInt(1, new_salary);
            pstmt.setInt(2,id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("updated salary for ID :" + id);
            }
            else{
                System.out.println("nothing updated !!");
            }
        }
    }
    private static void deleteData(Connection conn, int id) throws SQLException {
            String deleteSQL = "DELETE FROM users WHERE emp_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
             pstmt.setInt(1, id);
             int rowsDeleted = pstmt.executeUpdate();
             if (rowsDeleted > 0) {
                 System.out.println("Deleted user with ID: " + id);
             } else {
                 System.out.println("No user found with ID: " + id);
             }
         }
     }
    private static void selectviaid(Connection connection, int id) throws SQLException {
    String selectQuery = "SELECT * FROM users WHERE emp_id = ?";
    
    try (PreparedStatement pstmt = connection.prepareStatement(selectQuery)) {
        pstmt.setInt(1, id);  

        try (ResultSet rs = pstmt.executeQuery()) {
            System.out.println("Employee Data:");
            if (rs.next()) {
                System.out.println("EMP_ID: " + rs.getInt("emp_id") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Email: " + rs.getString("email") + 
                                   ", Salary: " + rs.getInt("salary"));
            } else {
                System.out.println("No employee found with ID: " + id);
            }
        }
    }
    }
}