/* 
 * Program to print the following pattern:
 * *****
 * ****
 * ***
 * **
 * *
 */
import java.util.*;
public class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        // i loop : iterating n times
        for (int i = 1; i <= n; i++)
        {
            // j loop : iterating (n-i+1) times
            for (int j = 1; j <= n-i+1; j++)
            {
                // Printing the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
