package Exam;

import java.util.Scanner;

/**
 * This class provides several methods for validating input data
 *
 */
public class Validator
{
    /**
     * Prompt users to input a whole line
     */
    public static String getLine(Scanner scanner, String prompt)
    {
        System.out.println(prompt);         // a prompt message
        String str = scanner.nextLine();    // read user's input
        return str;
    }

    /**
     * Prompt users to input a String
     */
    public static String getString(Scanner scanner, String prompt)
    {
        System.out.println(prompt);
        String str = scanner.next();       // read the first string on the line
        scanner.nextLine();               // discard the rest of the line
        return str;
    }

}
