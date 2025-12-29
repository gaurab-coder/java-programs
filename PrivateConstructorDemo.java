public class PrivateConstructorDemo
{
    String name;
    int age;
    private PrivateConstructorDemo()
    {
        name="Arjesh";
        age=32;
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        
    }
    public static void main(String arer[])
    {
    PrivateConstructorDemo obj=new PrivateConstructorDemo();
    }
}