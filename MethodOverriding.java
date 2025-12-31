class ParentClass
{
    void showdata()
    {
        System.err.println("Inside parentclass method");
    }
}
class ChildClass extends ParentClass
{
    void showdata()
    {
        System.err.println("Inside ChildClass method");
    }
}
public class MethodOverriding
{
    public static void main(String [] irhe)
    {
        ChildClass obj=new ChildClass();
        obj.showdata();
    }
}