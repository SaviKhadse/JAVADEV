package dboperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args){

        Connection conn = null;
        Statement stmt = null;
        try {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//            } catch (Exception e) {
//                System.out.println(e);
//            }
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/DemoJDBC", "root", "rootroot1234");

            //step2 create  the connection object
//            conn=DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");

            System.out.println("Connection is created successfully:");
            stmt = (Statement) conn.createStatement();
//            String query1 = "INSERT INTO Employees " + "VALUES (2, 'Jenny', 'Milpitas')"; //CRUD operations
//            stmt.executeUpdate(query1);
            String query1 = "Update Employees set Address = 'Santa Clara' where EmpID = 1" ;
            stmt.executeUpdate(query1);
            System.out.println("Record is updated in the table successfully..................");
        } catch (SQLException excep) {
            excep.printStackTrace();
        } catch (Exception excep) {
            excep.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {}
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
