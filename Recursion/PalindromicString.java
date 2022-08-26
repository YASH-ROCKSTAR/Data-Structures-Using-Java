package Recursion;

public class PalindromicString {
    // string on reversal is same as original then it is palindromic
    // ex=- MADAM means first and last are same
    // checking it again it they are equal then they are true
    // else false

    // checking s.charAt(i)==s.charAt(n-i-1) retrun true else return false
    // put first pointer on first point and last pointer on last
    // return true if they are matching
    // else return false if they are not matching at any point of time
    public static boolean palin(String s, int i, int n) {

        if (i >= n / 2)
            return true;

        if (s.charAt(i) == s.charAt(n - i - 1)) {
            return true;
        }
        return palin(s, i + 1, n);
    }

    public static void main(String[] args) {
        String s = "MADAM";
        int n = s.length();
        System.out.println(palin(s, 0, n));
    }
}
