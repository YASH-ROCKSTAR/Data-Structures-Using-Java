package Recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int n) {
        if (n == 0) {
            return 1;
        }
        int chootaproblem = pow(n - 1);
        int bigprob = 2 * chootaproblem;

        return bigprob;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = pow(n);
        System.out.println(ans);
    }
}
