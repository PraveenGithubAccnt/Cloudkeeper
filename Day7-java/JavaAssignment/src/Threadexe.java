public class Threadexe {
    private Integer data = null;

    synchronized void producer(int k) throws InterruptedException {
        while (data != null) {
            wait();
        }
        data = k;
        System.out.println("Produced: " + data);
        notifyAll();
    }

    synchronized void consumer() throws InterruptedException {
        while (data == null) {
            wait();
        }
        System.out.println("Consumed: " + data);
        data = null;
        notifyAll();
    }

    public static void main(String[] args) {

        Threadexe obj = new Threadexe();

        Thread t1 = new Thread(() -> {
            try {
                obj.producer(1000);
            } catch (Exception e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.consumer();
            } catch (Exception e) {}
        });

        t1.start();
        t2.start();
    }
}
