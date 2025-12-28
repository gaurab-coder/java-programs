import java.util.Scanner;
public class TransposeOfMatrix
{
    public static void main(String[] gaurab)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int trans[][]=new int[c][r];
        System.out.println("Enter elements of matrix");
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                a[x][y]=sc.nextInt();
            }
        }
         for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                trans[x][y]=a[y][x];
            }
        }
        System.out.println("transpose of matrix is:");
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                System.out.print(trans[x][y]+" ");
            }
            System.out.println();
        }

    }
}