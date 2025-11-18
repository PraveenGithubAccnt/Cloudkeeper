import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable running in: " + Thread.currentThread().getName());
        Thread.sleep(1000); // simulate some computation
        return 42; // return result
    }
}

public class Callablexe{
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new MyCallable());

        System.out.println("Result from callable: " + future.get());

        executor.shutdown();
    }
}
