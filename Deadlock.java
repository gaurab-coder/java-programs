public class Deadlock
{
    final String str1="Anjan";
    final String str2="Akhil";
    Thread thread1=new Thread()
    {
        public void run()
        {
            synchronized(str1)
            {
                try
                {
                    System.out.println(Thread.currentThread().getName()+"Locked str1"+str1);
                    Thread.sleep(100);
                }
                catch(Exception e)
                {
                    e.getMessage();
                }
                synchronized(str2)
                {
                    System.out.println(Thread.currentThread().getName()+" Locked str2 "+str2);
                }

            }
        }

    };
    Thread thread2=new Thread()
    {
        public void run()
        {
            synchronized(str2)
            {
                System.out.println(Thread.currentThread().getName()+" Locked str2 "+str2);
                synchronized(str1)
                {
                    System.out.println(Thread.currentThread().getName()+" Locked str1 "+str1);
                }
            }
        }
    };
    public static void main(String[] agei)
    {
        Deadlock obj=new Deadlock();
        obj.thread1.start();
        obj.thread2.start();
    }
}