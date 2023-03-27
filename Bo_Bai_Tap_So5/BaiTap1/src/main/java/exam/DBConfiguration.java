package Exam;

/**
 * This interface contains some constant variables
 */
public interface DBConfiguration
{
    // Declare DB configuration here, such as URL, ...
    // TO DO: add your code here
    String URL = "jdbc:mysql://localhost:3306/student", "root", "123456";
    Connection conn = DBConnection.getConnection(URL);
    Statement stmt = conn.createStatement();
}
