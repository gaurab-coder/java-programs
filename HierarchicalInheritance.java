class SuperClass
{
    void abc()
    {
        System.err.println("Your name:");
    }
}
class W extends SuperClass
{
    void gh()
    {
        System.err.println("My name is Salina khadka.");
    }
}
class X extends SuperClass
{
    void xn()
    {
        System.err.println("My name is Gaurab khadka.");
    }
}
class Z extends SuperClass
{
    void gh()
    {
        System.err.println("My name is Dipesh Nepali.");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[]joieh)
    {
         W up=new W();
        up.gh();
        X com=new X();
        com.xn();
        Z var=new Z();
        var.gh();
       
    }
}