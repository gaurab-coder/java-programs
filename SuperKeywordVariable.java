class SuperKeyword
{
    int a=84;
}
class SuperVariable extends SuperKeyword;
{
    int a=3;
    void display()
    {
        System.err.println(a);
        System.err.println(Super.a);
    }
}
public class SuperKeywordVariable
{
    public static void main(String [] weu)
    {
        SuperVariable supervariable=new SuperVariable();
        supervariable.display();
    }
}