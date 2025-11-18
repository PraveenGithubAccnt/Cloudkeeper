class Practical implements Runnable{
    private int count=0;

   public synchronized void increment()
    {

        count++;
    }

    public int getCount() {
        return count;
    }
    @Override
    public synchronized void run()
    {
        for(int i=1;i<=2000;i++) {
            increment();
        }
    }
}


public class PracticeThread {

    public static void main(String[] args)
    {
          Practical process= new Practical();

          Thread t1=new Thread(process);
          Thread t2=new Thread(process);

          //using lamda function
//        Thread t1=new Thread(()->{for(int i=1;i<=2000;i++) {process.increment();}});
//        Thread t2=new Thread(()->{for(int i=1;i<=2000;i++) {process.increment();}});

        t1.start();
        t2.start();

        try {
            t1.join();  //instruction to main thread and t2 thread that wait for this thread to finish first and terminate
            t2.join();  //instruction to main thread that wait wo this thread to finish first and terminate
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
       }
          System.out.println("the thread runned for "+ process.getCount());
    }
}
