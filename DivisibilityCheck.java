import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is NOT divisible by " + divisor);
            System.out.println("Remainder: " + (number % divisor));
        }
        
        scanner.close();
    }
}