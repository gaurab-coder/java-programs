class ThreadExample extends Thread
{
    public void run()
    {
        System.err.println("Thread:"+Thread.currentThread().getName());
    }
}
public class ThreadDemo
{
    public static void main(String [] kdfjoi)
    {
        System.err.println("Thread:"+Thread.currentThread().getName());
        ThreadExample t=new ThreadExample();
        t.start();
    }
}
// output will different in every time 