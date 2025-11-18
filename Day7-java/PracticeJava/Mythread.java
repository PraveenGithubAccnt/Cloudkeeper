class Threadex extends Thread {
    private String threadName;

    Threadex(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 2; i++) {
            System.out.println(threadName + " running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
    }
}

public class Mythread {
    public static void main(String[] args) {

        Threadex t1 = new Threadex("Thread-1");
        System.out.println(t1.getState());
        Threadex t2 = new Threadex("Thread-2");
        Threadex t3 = new Threadex("Thread-3");

        t1.start();
        System.out.println(t1.getState());
        t2.start();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        t3.start();
    }
}
