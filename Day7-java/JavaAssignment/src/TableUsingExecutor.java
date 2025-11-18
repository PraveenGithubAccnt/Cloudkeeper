import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TablePrnt {
    private boolean turnFor2 = true; // true → table of 2's turn, false → table of 4's turn

    public synchronized void printTable2() {
        for (int i = 1; i <= 10; i++) {
            try {
                while (!turnFor2) {
                    wait();
                }
                System.out.println("2 x " + i + " = " + (2 * i));
                turnFor2 = false;
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printTable4() {
        for (int i = 1; i <= 10; i++) {
            try {
                while (turnFor2) {
                    wait();
                }
                System.out.println("4 x " + i + " = " + (4 * i));
                turnFor2 = true; // now turn for 2
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TableUsingExecutor {
    public static void main(String[] args) {
        TablePrnt printer = new TablePrnt();


        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> printer.printTable2());
        executor.execute(() -> printer.printTable4());

        executor.shutdown(); // stop accepting new tasks
    }
}
