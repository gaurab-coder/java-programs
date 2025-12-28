import java.util.Scanner;
public class ClassAndObject
{
    void display()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter two people's age:");
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>b)
        {
            System.out.println("First person is older.");
        }
        else
        {
            System.out.println("Second person is older.");
        }   

    }
    public static void main(String are[])
    {
        System.err.println("class and object example:");
        ClassAndObject obj=new ClassAndObject();
        obj.display();
        obj.display();
    }
}
