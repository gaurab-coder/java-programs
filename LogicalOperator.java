class LogicalOperator
{
    public static void main(String[] a)
    {
        int x=33;
        int y=83;
        int c=76;
        System.err.println("And Operator");
        System.err.println(x<y && y<c);
        System.err.println("Or Operator");
        System.err.println(x<y || y>c);
        System.err.println("Not Operator");
        System.err.println(!(x==y));
    }
}