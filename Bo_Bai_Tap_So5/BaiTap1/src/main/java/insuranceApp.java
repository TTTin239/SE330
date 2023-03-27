package Exam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import exam.*;
/**
 * This is a test program for Insurance App
 *
 */
public class InsuranceApp  implements DBConfiguration
{
    private static Scanner scanner = null;

    public static void main(String args[])
    {
        // Display a welcome message
        System.out.println("Welcome to the Insurance Maintenance application\n");

        // Set the class variable to read user's input from console
        scanner = new Scanner(System.in);

        // Perform 1 or more choices
        String choice = "";

        do {
            // Display the command menu
            menu();

            /* Read and validate input from users */
            choice = Validator.getString(
                    scanner, "Please input your choice (case-insensitive)");
            System.out.println();

            /* TO DO: add your code here to validate user's choice and process it*/
            switch (choice) {
                case "list":
                    displayAllInsurances();
                    break;
                case "add":
                    addInsurance();
                    break;
                case "exit":
                    System.out.println("Program ended.\n");
                    exit(1);
                    break;
                default:
                    System.out.println("The command is not valid.\n");
                    break;
            }
        } while (1);
    }

    public static void menu()
    {
        System.out.println();
        System.out.println("************************  MENU  ***************************");
        System.out.println("Please enter a command list/add/exit (case-insensitive)");
        System.out.println("- list -> List all insurances");
        System.out.println("- add  -> Add an insurance");
        System.out.println("- exit -> Exit this application");
        System.out.println("***********************************************************");
        System.out.println();
    }

    /**
     * Dipslay all insurances
     */
    public static void displayAllInsurances(){
        //String query = "select * from insurances";
        // TO DO: add your code here to print out all insurances
        ResultSet rs = stmt.executeQuery("SELECT * FROM insurances");
        // in the required format as shown in slide
        try
        {

        }
    } catch (SQLException ex) {
    ex.printStackTrace();
}
}

    /**
     * This is used to add a new insurance into database
     */
    public static void addInsurance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id");
        String id = sc.next();
        System.out.println("Nhập vào category");
        String category = sc.next();
        System.out.println("Nhập vào category");
        int category = sc.nextInt();
        System.out.println("Nhập vào price");
        double price = sc.nextDouble();
        PreparedStatement myStmt = conn.prepareStatement("INSERT INTO insurances  VALUE (?, ?, ?, ?)");
        myStmt.setString(1, id);
        myStmt.setString(2, category);
        myStmt.setString(3, category);
        myStmt.setString(4, price);
        System.out.println("This feature will be available in the future. "
                + "You don't need to implement it!");
    }
}