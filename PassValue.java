public class PassValue
{
    public static void main(String [] asedfe)
    {
        int a=38;
        System.err.println("Before calling the method:" +a);
        PassValue object=new PassValue();
        object.modifyValue(a);
        System.err.println("After calling the method:" +a);
    }
    void modifyValue(int a)
    {
        a=393;
        System.err.println("inside the method:" +a);
    }
}