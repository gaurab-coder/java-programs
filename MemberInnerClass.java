class Outer 
{
    public void display()
    {
        Inner obj=new Inner();
        obj.show();
    }
}
class Inner
{
    void show()
    {
        System.err.println("haha");
        System.err.println("This is inner class.");
        
    }
}
public class MemberInnerClass
{
    public static void main(String [] skjfieuh)
    {
        Outer object=new Outer();
        object.display();
    }
}