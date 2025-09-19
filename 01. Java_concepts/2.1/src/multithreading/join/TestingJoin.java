public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\nThread 1 started");

        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\nThread 2 started");

        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\nThread 3 started");

        t1.join();
        t2.join();
        t3.join();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}

class PrintTask implements Runnable {
    private char charToPrint;

    public PrintTask(char c) {
        this.charToPrint = c;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(charToPrint);
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
