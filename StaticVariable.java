public class StaticVariable
{
    static int i=5;
    void staticmethod()
    {
        int b=65;
        System.err.println("I="+i);
        System.err.println("B="+b);
        System.err.println();
        i++;
        b++;
    }
    public static void main(String[] ag)
    {
        StaticVariable obj=new StaticVariable();
        obj.staticmethod();
        obj.staticmethod();
    }
}