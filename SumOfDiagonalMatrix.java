import java.util.Scanner;
public class SumOfDiagonalMatrix
{
    public static void main(String[] gau)
    {
        int a[][]=new int[3][3];
        int i,j,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum=sum+a[i][j];
                }
            }
        }
                    System.err.println("Sum of diagonal elements is:"+sum);
                }
            }
        