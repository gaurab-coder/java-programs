class MethodsReturnValues
{
    public static void main(String ae[])
    {
        int z=39;
        int a=2;
        MethodsReturnValues object=new MethodsReturnValues();
        int c=object.sum(z,a);
        System.err.println("the sum is :" +c);
    }
    public int sum(int z, int a)
    {
        int c=z+a;
        return c;
    }
}