class SuperKeyboardVariable1
{
    int a=5;
}
class SuperKeyboardVariable2 extends SuperKeyboardVariable1
{
int a=10;
void display()
{
System.out.println(a);
System.out.println(super.a);
}
}
public class SuperKeyboardVariable
{
    public static void main(String[] args)
{
SuperKeyboardVariable2 obj=new SuperKeyboardVariable2();
obj.display();
}
}