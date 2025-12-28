public class ExplicitTypeCasting
{
    public static void main(String[] afe)
    {
        double d=99.09;
        int i=(int)d;
        byte b=(byte)d;
        short s=(short)d;
        float f=(float)d;
        System.out.println("Explicit type casting:");
        System.out.println(("double value to int:"+i));
        System.out.println(("double value to byte:"+b));
        System.out.println(("double  to short:"+s));
        System.out.println(("double value to float:"+f));
    }
}