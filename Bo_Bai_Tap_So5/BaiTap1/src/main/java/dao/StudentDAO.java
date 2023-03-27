//package dao;
//
//import model.Student;
//import utils.DBConnection;
//
//import java.sql.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//public class StudentDAO {
//    public static List<Student> getAllStudent() {
//        List<Student> Students = null;
//        try {
//            Students = new ArrayList<>();
//            // connnect to database 'testdb'
//            Connection conn = DBConnection.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
//            // crate statement
//            Statement stmt = conn.createStatement();
//            // get data from table 'Student'
//            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
//            // show data
//            while (rs.next()) {
//                Students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9)));
//                System.out.println(rs.getString(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3) + " " + rs.getString(4)
//                        + " " + rs.getString(5) + " " + rs.getString(6)
//                        + " " + rs.getString(7) + " " + rs.getInt(8)
//                        + " " + rs.getDouble(9));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return Students;
//    }
//    public static List<Student> getStudent_id() {
//        List<Student> Students = null;
//        try {
//            Students = new ArrayList<>();
//            // connnect to database 'testdb'
//            Connection conn = DBConnection.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
//            // crate statement
////            Statement stmt = conn.createStatement();
////            // get data from table 'Student'
////            ResultSet rs = stmt.executeQuery("SELECT*FROM Student WHERE score=9.45");
//            // show data
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhập vào student_id của sinh viên:");
//            String sv = sc.next();
//            PreparedStatement myStmt = conn.prepareStatement("SELECT * FROM Student WHERE student_id LIKE ?");
//            myStmt.setString(1, sv);
//            ResultSet rs = myStmt.executeQuery();
//            while (rs.next()) {
//                Students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9)));
//                System.out.println(rs.getString(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3) + " " + rs.getString(4)
//                        + " " + rs.getString(5) + " " + rs.getString(6)
//                        + " " + rs.getString(7) + " " + rs.getInt(8)
//                        + " " + rs.getDouble(9));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return Students;
//    }
//    public static List<Student> AddStudent() {
//
//        List<Student> Students = null;
//        try {
//            Students = new ArrayList<>();
//            // connnect to database 'testdb'
//            Connection conn = DBConnection.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
//            // crate statement
//            //Statement stmt = conn.createStatement();
//            // get data from table 'Student'
//            //ResultSet rs = stmt.executeQuery("SELECT studen_id FROM Student");
//            // show data
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhập vào student_id của sinh viên:");
//            String id = sc.next();
//            System.out.println("Nhập vào first_name của sinh viên:");
//            String F_Name = sc.next();
//            System.out.println("Nhập vào last_name của sinh viên:");
//            String L_Name = sc.next();
//            System.out.println("Nhập vào dob của sinh viên:");
//            String dob = sc.next();
//            System.out.println("Nhập vào department của sinh viên:");
//            String department = sc.next();
//            System.out.println("Nhập vào entrance_date của sinh viên:");
//            String entrance_date = sc.next();
//            System.out.println("Nhập vào credits của sinh viên:");
//            int credits = sc.nextInt();
//            System.out.println("Nhập vào score của sinh viên:");
//            double score = sc.nextDouble();
//            PreparedStatement myStmt = conn.prepareStatement("INSERT INTO Student VALUE (?, ?, ?, ?, ?, ?, NULL, ?, ?)");
//            myStmt.setString(1, id);
//            myStmt.setString(2, F_Name);
//            myStmt.setString(3, L_Name);
//            myStmt.setString(4, dob);
//            myStmt.setString(5, department);
//            myStmt.setString(6, entrance_date);
//            myStmt.setInt(8, credits);
//            myStmt.setDouble(9, score);
//            ResultSet rs = myStmt.executeQuery();
//            while (rs.next()) {
//                Students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9)));
//                System.out.println(rs.getString(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3) + " " + rs.getString(4)
//                        + " " + rs.getString(5) + " " + rs.getString(6)
//                        + " " + rs.getString(7) + " " + rs.getInt(8)
//                        + " " + rs.getDouble(9));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return Students;
//    }
//    public static List<Student> UpdateStudent() {
//        List<Student> Students = null;
//        try {
//            Students = new ArrayList<>();
//            // connnect to database 'testdb'
//            Connection conn = DBConnection.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
//            // crate statement
////            Statement stmt = conn.createStatement();
////            // get data from table 'Student'
////            ResultSet rs = stmt.executeQuery("SELECT studen_id FROM Student");
//            // show data
//            //PreparedStatement myStmt = conn.prepareStatement("DELETE FROM Student WHERE  student_id = ?");
//            //myStmt.setString(1, 'abc');
//            //ResultSet rs = myStmt.executeQuery();
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhập vào student_id của sinh viên cần update:");
//            String id = sc.next();
//            System.out.println("Nhập vào first_name của sinh viên:");
//            String first_name = sc.next();
//            System.out.println("Nhập vào last_name của sinh viên:");
//            String last_name = sc.next();
//            System.out.println("Nhập vào department của sinh viên:");
//            String department = sc.next();
//            System.out.println("Nhập vào credits của sinh viên:");
//            int credits = sc.nextInt();
//            System.out.println("Nhập vào score của sinh viên:");
//            double score = sc.nextDouble();
//            PreparedStatement myStmt = conn.prepareStatement("UPDATE Student SET first_name = ?, last_name = ?, department = ?, credits = ?, score = ? WHERE student_id LIKE ?");
//            myStmt.setString(1, first_name);
//            myStmt.setString(2, last_name);
//            myStmt.setString(3, department);
//            myStmt.setInt(4, credits);
//            myStmt.setDouble(5, score);
//            myStmt.setString(6, id);
//            ResultSet rs = myStmt.executeQuery();
//            while (rs.next()) {
//                Students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9)));
//                System.out.println(rs.getString(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3) + " " + rs.getString(4)
//                        + " " + rs.getString(5) + " " + rs.getString(6)
//                        + " " + rs.getString(7) + " " + rs.getInt(8)
//                        + " " + rs.getDouble(9));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return Students;
//    }
//    public static List<Student> DeleteStudent() {
//        Scanner sc = new Scanner(System.in);
//        List<Student> Students = null;
//        try {
//            Students = new ArrayList<>();
//            // connnect to database 'testdb'
//            Connection conn = DBConnection.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
//            // crate statement
////            Statement stmt = conn.createStatement();
//            // get data from table 'Student'
//            System.out.println("Nhập student_id SV cần xóa:");
//            String sv = sc.next();
//
////            ResultSet rs = stmt.executeQuery("DELETE FROM Student WHERE last_name=?");
//            PreparedStatement myStmt = conn.prepareStatement("DELETE FROM Student WHERE  student_id LIKE ?");
//            myStmt.setString(1, sv);
//            ResultSet rs = myStmt.executeQuery();
//            // show data
//            while (rs.next()) {
//                Students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9)));
//                System.out.println(rs.getString(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3) + " " + rs.getString(4)
//                        + " " + rs.getString(5) + " " + rs.getString(6)
//                        + " " + rs.getString(7) + " " + rs.getInt(8)
//                        + " " + rs.getDouble(9));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return Students;
//    }
//}