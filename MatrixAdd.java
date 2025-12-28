import java.util.Scanner;
public class MatrixAdd
{
    public static void main(String[] gaurav)
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner o=new Scanner(System.in);
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<3;i++)
        {
            for (int k=0;k<3;k++)
            {
                a[i][k]=o.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<3;i++)
        {
        for (int k=0;k<3;k++)
         {
        b[i][k]=o.nextInt();
         }
        }
         for (int i=0;i<3;i++)
         {
         for(int k=0;k<3;k++)
         {
         c[i][k]=a[i][k]+b[i][k];
         }
         }
         System.out.println("Sum of two matrices:");
         for(int i=0;i<3;i++)
         {
         for(int n=0;n<3;n++)
         {
         System.out.print(c[i][n]+" ");
         }
         System.out.println();
    }
    }

}