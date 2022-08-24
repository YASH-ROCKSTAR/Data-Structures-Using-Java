package Recursion;

public class Fibonacci {
    static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = fib(n - 1);
        int sec = fib(n - 2);

        return first + sec;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
