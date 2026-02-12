// To print the folloing:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
import java.util.*;
public class Pattern6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        // Nested Loop 1 : increasing stars
        // i loop : iterating n times
        for (int i = 1; i <= n; i++)
        {
            // j loop : iterating i times
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // Nested loop 2 : decreasing stars
        // i loop : iterating n-1 times
        for (int i = 1; i <= n - 1; i++)
        {
            // j loop : iterating n-i times
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
