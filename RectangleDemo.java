interface Shape
{
    void area();
}

interface Perimeter
{
    void perimeter();
}

public class RectangleDemo implements Shape, Perimeter
{
    int length = 10;
    int breadth = 5;

    public void area()
    {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void perimeter()
    {
        int peri = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + peri);
    }

    public static void main(String[] args)
    {
        RectangleDemo r = new RectangleDemo();
        r.area();
        r.perimeter();
    }
}
