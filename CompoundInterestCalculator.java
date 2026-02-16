// Java program to find compound interest with user input
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();
        
        scanner.close();
        
        // Calculate compound interest: P * (1 + r/100)^t - P
        double amount = principal * Math.pow((1 + rate / 100), time);
        double CI = amount - principal;
        
        System.out.printf("Compound Interest is %.2f%n", CI);
    }
}
