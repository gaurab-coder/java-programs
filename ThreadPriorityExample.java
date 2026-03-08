class ThreadPriorityDemo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}
public class ThreadPriorityExample
{

    public static void main(String[] arer)
    {
        System.out.println("Thread.currentThread().getPriority()");
        System.out.println("Main thread");

        ThreadPriorityDemo t1=new ThreadPriorityDemo();
        ThreadPriorityDemo t2=new ThreadPriorityDemo();
        ThreadPriorityDemo t3=new ThreadPriorityDemo();

        System.out.println("priority of thread t1 is:"+t1.getPriority());
        System.out.println("priority of thread t2 is:"+t2.getPriority());
        System.out.println("priority of thread t3 is:"+t3.getPriority());

        t1.setPriority(4);
        t2.setPriority(7);
        t3.setPriority(9);
        System.out.println("priority of thread t1 is :"+t1.getPriority());
        System.out.println("priority of thread t2 is :"+t2.getPriority());  
        System.out.println("priority of thread t3 is :"+t3.getPriority());
        System.out.println("Currently executing thread:"+Thread.currentThread().getName());
        System.out.println("priority of main thread is :"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(23);
        System.out.println("priority of main thread is :"+Thread.currentThread().getPriority());
    }
}