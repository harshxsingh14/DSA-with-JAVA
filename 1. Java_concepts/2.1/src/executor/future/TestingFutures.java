
import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        FetchName task1 = new FetchName("Harsh");
        FetchName task2 = new FetchName("Sachin");
        FetchName task3 = new FetchName("Dev");
        FetchName task4 = new FetchName("Laksh");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull Name is: %s", name1.get());
        System.out.printf("\nFull Name is: %s", name2.get());
        System.out.printf("\nFull Name is: %s", name3.get());
        System.out.printf("\nFull Name is: %s", name4.get());

        service.shutdown();
    }
}







