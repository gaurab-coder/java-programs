class WaitNotifyDemo extends Thread
{
    public void run()
    {
        synchronized(this)
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Child Thread");
            }

            notify();   // notify main thread
        }
    }
}

public class InterThreadCommunication
{
    public static void main(String[] args)
    {
        WaitNotifyDemo obj = new WaitNotifyDemo();
        obj.start();

        synchronized(obj)
        {
            System.out.println("Main thread waiting for child thread completion");

            try
            {
                obj.wait();   // main thread waits
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

            System.out.println("Main thread resumed");
        }
    }
}