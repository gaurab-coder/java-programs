class SuperKeywordMethod1
{
    void gan()
    {
    int a=8,b=56;
    int sum =a+b;
    System.out.println("the sum is :"+sum);
    }
}
class SuperKeywordMethod2 extends SuperKeywordMethod1
{
    int a=3;
    void gun()
    {
        System.err.println(a);
        super.gan();
    }

}
public class SuperKeywordMethods
{
    public static void main(String [] aj)
    {
        SuperKeywordMethod2 objo= new SuperKeywordMethod2();
        objo.gun();
    }
}