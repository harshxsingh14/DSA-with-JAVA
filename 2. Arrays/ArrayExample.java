import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Enter the numbers\n");
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);

        in.close(); 
    }
}
