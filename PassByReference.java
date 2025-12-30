public class PassByReference
{
    int r=89;
    void updateMethod(int r)
    {
        this.r=r*5;
    }
    public static void main(String ae[])
    {
        PassByReference obj=new PassByReference();
        System.err.println("before calling the method:" +obj.r);
        PassByReference obj2;
        obj2=obj;
        obj2.updateMethod(100);
        System.err.println("After calling the method:" +obj.r);

    }
}