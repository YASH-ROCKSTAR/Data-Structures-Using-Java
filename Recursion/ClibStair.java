package Recursion;

public class ClibStair {
    public static int climb(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int ans = climb(n - 1) + climb(n - 2);

        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(climb(n));

    }
}
