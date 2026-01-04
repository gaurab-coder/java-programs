class SuperClassKeyword1
{
    public SuperClassKeyword1()
    {
        System.err.println("This is parent class.");
    }
}
class SuperClassKeyword2 extends SuperClassKeyword1
{
    public SuperClassKeyword2()
    {
        super(); //it calls the parent class by default.
        System.err.println("This is child class.");
    }
}
public class SuperClassKeyword
{
    public static void main(String [] jsdfi)
    {
        SuperClassKeyword2 obj=new SuperClassKeyword2();
        //NO need to call the constructor.
    }
}