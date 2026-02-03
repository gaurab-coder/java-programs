class ThreadExamples extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
        System.err.println("Gaurab");
        }
    }
}
public class ThreadsRunMethods
{
    public static void main(String [] kdfjoi)
    {
        
        ThreadExamples t=new ThreadExamples();
        t.start();
        for(int i=0;i<5;i++)
        {
            System.err.println("bishal");
        }
    }
}