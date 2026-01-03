class SuperClass
{
    int num1=55,num2=6,result;
    void sum()
    {
        result=num1+num2;
        System.err.println("the sum:"+result);

    }
}
class multiply extends SuperClass
{
    void mul()
    {
        result=num1*num2;
        System.err.println("the multiplication:"+result);
    }
}
class Subtraction extends multiply
{
    void sub()
    {
        result=num1-num2;
        System.err.println("the subtraction:"+result);
    }
}
public class MultiLevelInheritance
{
    public static void main(String [] ajh)
    {
        Subtraction gana=new Subtraction();
        gana.sub();
        gana.mul();
        gana.sum();
    }
}