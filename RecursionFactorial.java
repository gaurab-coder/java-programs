import java.util.Scanner;
public class RecursionFactorial
{
    public static void main (String [] args)
    {
        int n;
        long f;
        Scanner input= new Scanner (System.in);
        System.out.print("Enter a number");
        n=input.nextInt();
        f=fact(n);
        System.out.println("Factorial is:"+f);
         input.close();

    }
    static long fact(int n)
    {
        if(n>1)
        {
            return n*fact(n-1);

        }
        else
        {
            return 1;
        }
       

    }
}