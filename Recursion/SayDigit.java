package Recursion;

public class SayDigit {
    public static void say(int n, String arr[]) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        n = n / 10;

        say(n, arr);
        System.out.print(arr[digit] + " ");

    }

    public static void main(String[] args) {
        int n = 412;
        String arr[] = { "Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        say(n, arr);
    }

}
