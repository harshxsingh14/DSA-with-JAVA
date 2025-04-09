
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping Numbers Program");

        System.out.print("Enter value of A: ");
        int a = input.nextInt();

        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        input.close();
    }
}
