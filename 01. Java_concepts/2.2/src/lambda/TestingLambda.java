
public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        int sum = test.sum(6, 7);
        test.printString("Luffy will become the king of the pirates");

    }

    private void printString(String toPrint) {
        System.out.println(toPrint);
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}