public class Scope
{
    public static void main (String[] arg)
    {
        int x=10;
        if (x==10)
        {
            int b=30;
            System.out.println("X is equal");
            x=b+5;
        }
        System.out.println("value of X="+x);
        /*System.out.println("value of b="+b); */
    }
}