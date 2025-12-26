import java.util.Scanner;
public class IfElse
{
    public static void main(String [] edcb)
    {
        int age;
        Scanner input=new Scanner(System.in);
        System.err.println("Enter your age:");
        age=input.nextInt();
        if(age>=18)
        {
            System.err.println("you are eligible to vote.");
        }
        else
        {
            System.err.println("you are not eligible to vote.");
        }
        }
    }
