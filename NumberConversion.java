import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Integer to Binary, Octal, and Hexadecimal Converter");
        
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
        // Convert to Binary
        String binary = Integer.toBinaryString(number);
        
        // Convert to Octal
        String octal = Integer.toOctalString(number);
        
        // Convert to Hexadecimal
        String hexadecimal = Integer.toHexString(number);
        
        // Display results
       
        System.out.println("Conversion Results for: " + number);
        System.out.println("Binary:       " + binary);
        System.out.println("Octal:        " + octal);
        System.out.println("Hexadecimal:  " + hexadecimal.toUpperCase());
        
        scanner.close();
    }
}