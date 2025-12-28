import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String [] er)
    {
        int n;
        Scanner gau=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n=gau.nextInt();
        int a=0,b=1;
        int sum=0;
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++)    
        {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
            
        }
    }
}