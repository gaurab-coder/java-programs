// Program to print like the following pattern:
//  *****
//  *****
//  *****
//  *****
//  *****

import java.util.*;
public class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        // i loop : iterating n times
        for (int i = 1; i <= n; i++)
        {
            // j loop : iterating n times
            for (int j = 1; j <= n; j++)
            {
                // Printing the stars
                System.out.print("*"); 
            }
            // Leaving the line after the 'j' loop
            System.out.println(); 
        }
    }
}
