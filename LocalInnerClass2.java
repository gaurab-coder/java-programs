class Bank
{
    void calculateInterest()
    {
        int rate = 7;  // effectively final

        class Interest   // Local Inner Class
        {
            void show()
            {
                System.out.println("Interest rate: " + rate + "%");
            }
        }

        Interest obj = new Interest();
        obj.show();
    }
}

public class 
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.calculateInterest();
    }
}
