public class DeadlockExample {

    static Object resource1 = new Object();
    static Object resource2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " locked Resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " locked Resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked Resource 2");

                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    synchronized (resource1) {
                        System.out.println(Thread.currentThread().getName() + " locked Resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}