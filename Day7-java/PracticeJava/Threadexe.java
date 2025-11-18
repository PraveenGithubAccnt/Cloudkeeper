public class Threadexe {
    private Integer data = null;

    synchronized void produce(int k) throws InterruptedException {
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
                obj.produce(100);
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.consumer();
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
    }
}
