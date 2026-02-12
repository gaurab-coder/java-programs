//  To print like the following : 
//     *
//    **
//   ***
//  ****
// *****
import java.util.*;
public class Pattern4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n = sc.nextInt();
        // i loop : iterating n times
        for (int i = 1; i <= n; i++)
        { 
            // Printing the spaces
            // iterating n-i times
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" "); 
            }
            // Printing the stars
            // iterating i times
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
