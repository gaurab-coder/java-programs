import java.util.Scanner;

public class PrimeComposite
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num <= 1)
        {
            System.out.println("Neither Prime nor Composite");
        }
        else
        {
            int count = 0;

            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0)
                    count++;
            }

            if (count == 2)
                System.out.println("Prime number");
            else
                System.out.println("Composite number");
        }

        input.close();
    }
}
