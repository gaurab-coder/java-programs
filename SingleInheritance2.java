class Parent
{
    void show()
    {
        System.out.println("Parent class method");
    }
}

class Child extends Parent
{
}

public class SingleInheritance2
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.show();
    }
}
