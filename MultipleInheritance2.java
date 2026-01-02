interface X
{
    void displayX();
}

interface Y
{
    void displayY();
}

class Z implements X, Y
{
    public void displayX()
    {
        System.out.println("X interface method");
    }

    public void displayY()
    {
        System.out.println("Y interface method");
    }
}

public class MultipleInheritance2
{
    public static void main(String[] args)
    {
        Z obj = new Z();
        obj.displayX();
        obj.displayY();
    }
}
