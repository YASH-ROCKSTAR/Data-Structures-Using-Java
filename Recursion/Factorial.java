package Recursion;

import java.util.Scanner;

class Fact {
    // exaple fro fact(3)
    // dekho ab dekhe gye kaise call stack mein kam kare gya

    // stack mein main tyo ho gyan
    // call fact(3)
    // then check 3==0
    // calling another fucntion fact(2)
    // again cherck base case
    // call fact(1)
    // check again base case
    // then fact (0) is in stack then base case become treu
    // and ot return 1
    // smaller prob=1
    // big prob=n*spell
    // 1*1=1
    // smaller prob=1
    // big prob=n*spell
    // then return 1 to sp problem
    // then it start giving values in big problem
    // 2*1=2;
    // 3*2=6;

    public static int fac(int n) {
        // ye loop chalta jaye gya bass wo call karta ajye gya
        // isliye hum base case lagate hai
        // ye stackoverflow ho aye gya agar base case nhi ho gbya
        // segmetation fault ho jaye gya
        if (n == 0) {
            return 1;
        }
        // ye chooti problem ko solve kar de
        int chooti = fac(n - 1);
        // ye bada problem hai ye choti se big ko solve kare gya
        int badi = n * chooti;

        return badi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = fac(n);

        System.out.println(ans);
    }
}