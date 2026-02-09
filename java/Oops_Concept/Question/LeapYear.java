package Question;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (DD-MM-YYYY): ");
        String input = sc.nextLine();

        boolean splitResult = checkLeapUsingStringSpilit(input);
        boolean substringResult = checkLeapUsingStringSubstring(input);
        boolean localDateResult = checkleapyearusingLoacalDate(input);

        System.out.println("\n===== TEST OUTPUT =====");

        System.out.println("Using String Split      : " +
                (splitResult ? "Leap Year" : "Not a Leap Year"));

        System.out.println("Using String Substring  : " +
                (substringResult ? "Leap Year" : "Not a Leap Year"));

        System.out.println("Using LocalDate         : " +
                (localDateResult ? "Leap Year" : "Not a Leap Year"));

        sc.close();
    }

    static boolean checkLeapUsingStringSpilit(String input) {
        String[] parts = input.split("-");
        int year = Integer.parseInt(parts[2]);

        return (year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0);
    }

    static boolean checkLeapUsingStringSubstring(String input) {
        String yearString = input.substring(6);
        int year = Integer.parseInt(yearString);

        return (year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0);
    }

    static boolean checkleapyearusingLoacalDate(String input) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(input, formatter);
        return date.isLeapYear();
    }
}
