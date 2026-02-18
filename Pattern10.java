import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows for Pascal's triangle: ");
        int rows = scanner.nextInt();
        
        System.out.println("\nPascal's Triangle with " + rows + " rows:");
        printPascalTriangle(rows);
        
        scanner.close();
    }
    
    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for better formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print values
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            
            System.out.println();
        }
    }
}