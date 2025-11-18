import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolexe {
    public static void main(String[] args) {
        // Create a fixed-size thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Executing task " + taskId + " by thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shut down the thread pool (waits for submitted tasks to complete)
        executorService.shutdown();
    }
}