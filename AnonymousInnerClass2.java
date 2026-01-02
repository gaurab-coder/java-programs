abstract class Shape
{
    abstract void draw();
}

public class AnonymousInnerClass2
{
    public static void main(String[] args)
    {
        Shape s = new Shape()
        {
            void draw()
            {
                System.out.println("Drawing a Circle");
            }
        };

        s.draw();
    }
}
