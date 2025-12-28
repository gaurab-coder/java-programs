class ContinueStatement 
{
    public static void main(String ae[])
    {
        for(int i=100;i>50;i--)
        {
            if(i==90)
                continue;
            System.err.print("\t"+i);
        }
    }
}