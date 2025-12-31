public class MethodOverloading
{
    void display ()
    {
        System.err.println("There is no parameter");
    }
    void display(int a)
    {
        System.err.println("A:"+a);

    }
    void display(int y, int z)
    {
        int i=y*z;
        System.err.println("the multiplication:"+i);
    }
    public static void main(String [] eriuh)
    {
        MethodOverloading hua=new MethodOverloading();
        hua.display();
        hua.display(78);
        hua.display(9,2);
    }
}