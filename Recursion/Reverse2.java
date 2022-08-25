package Recursion;

public class Reverse2 {

    // se basically we are using only one pointer
    // and we are using i and n-i-1 as first nad last pointer
    // and using base case as till i>=n/2 it will run after that it return

    static void f(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        f(i + 1, arr, n);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        f(0, arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
