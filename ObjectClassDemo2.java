public class ObjectClassDemo2
{
    public static void main(String [] ojfh)
    {
        Object s=new String(" Welcome to java project!");
        Object i=new Integer(100);
        Object d=new Double(109.99);
        Object f=new Float(990.98);
        Class ss=s.getClass();
        Class ii=i.getClass();
        Class dd=d.getClass();
        Class ff=f.getClass();
        System.err.println("String value:"+s);
        System.err.println("String value:"+i);
        System.err.println("String value:"+d);
        System.err.println("String value:"+f);
    }
}