public class MemberLocalInner
{
    int a=29;
    void you()
    {
        class LocalInner
        {
            void me()
            {
                System.out.println("outer class a:"+a);
                System.err.println("It's local inner class.");
            }
        }
        LocalInner gaurab=new LocalInner();
        gaurab.me();
    }
    public static void main(String gb[])
    {
        MemberLocalInner san=new MemberLocalInner();
        san.you();
    }
}