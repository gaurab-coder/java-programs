import java.util.Scanner;

public class LeapYearCheck {
    // Method to check leap year
    public static void isLeapYear(int year) {
        boolean is_leap_year;

        // Simplified leap year logic
        // A year is a leap year if:
        // - It is divisible by 4 AND not divisible by 100
        // OR
        // - It is divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            is_leap_year = true;
        } else {
            is_leap_year = false;
        }

        if (is_leap_year)
            System.out.println(year + " : Leap-year");
        else
            System.out.println(year + " : Non Leap-year");
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year to check: ");
        int year = scanner.nextInt();
        
        // Call the function with user input
        isLeapYear(year);
        
        scanner.close();
    }
}