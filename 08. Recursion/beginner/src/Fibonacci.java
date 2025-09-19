public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibon(50);
        System.out.println(ans);
    }

    static int fibon(int n) {

        if (n < 2) {
            return n;
        }
        return fibon(n-1) + fibon(n-2);
    }
}