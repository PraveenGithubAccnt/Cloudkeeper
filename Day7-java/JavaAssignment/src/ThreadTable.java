public class ThreadTable {

    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();

        Thread t1 = new Thread(new TableRunnable(printer, 2));
        Thread t2 = new Thread(new TableRunnable(printer, 4));

        t1.start();
        t2.start();
    }
}

class TablePrinter {
    private boolean turnFor2 = true;

    public synchronized void printTable(int number) {
        for (int i = 1; i <= 10; i++)
        {
            try {
                while ((number == 2 && !turnFor2) || (number == 4 && turnFor2)) {
                    wait();
                }

                System.out.println(number + " x " + i + " = " + (number * i));
                turnFor2 = !turnFor2;
                notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TableRunnable implements Runnable {
    private final TablePrinter printer;
    private final int number;

    public TableRunnable(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    @Override
    public void run() {
        printer.printTable(number);
    }
}
