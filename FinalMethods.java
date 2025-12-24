public class FinalMethods extends Company
{
    void comment()
    {
        System.out.println("final method");
    }
    public static void main(String[]ras)
    {
FinalMethods fm=new FinalMethods();
fm.comment();

    }
}
class Company
{
    final void comment()
    {
        System.out.println("Company final method");
    }
}