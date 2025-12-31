public class StaticNestedClasses
{
   static int a=90;
   static int b=87;
   static class StaticNestedDemo
    {
        void show()
        {
            System.err.println("value of A="+a);
            System.err.println("value of B="+b);
        }
    }
    public static void main(String [] asjkfhb)
    {
        StaticNestedClasses.StaticNestedDemo obj=new StaticNestedClasses.StaticNestedDemo();
        obj.show();
    }
}