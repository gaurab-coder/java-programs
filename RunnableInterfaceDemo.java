// Implementing Runnable interface
class RunnableInterface implements Runnable {

    // @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is child thread");
        }
    }
}

public class RunnableInterfaceDemo {

    public static void main(String[] args) {

        RunnableInterface ri = new RunnableInterface();

        // Creating Thread object
        Thread t = new Thread(ri);

        // Starting thread
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("This is main thread");
        }
    }
}