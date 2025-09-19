
public class SecondTask extends Thread {
    @Override
    public void run() {
        // Second task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n %s $ task complete",
                Thread.currentThread().getName());
    }
}
