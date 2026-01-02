class A
{
    void display()
    {
        System.err.println("a class");
    }
}
class B extends A
{
    void gaurab()
    {
        System.err.println("this is class b");
    }
}
public class SingleInheritanceDemo
{
    public static void main(String [] ajiuf)
    {
        B obj=new B();
         obj.display();
        obj.gaurab();
       
    }
}
