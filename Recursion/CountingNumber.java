package Recursion;

public class CountingNumber {
    public static void cou(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        cou(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        cou(n);
    }

}
