package Recursion;

public class ReverseArray {
    // so what we arte doing there is that
    // we are putting left pointer on first
    // and right pointer on last
    // and swap l and r in arr
    // increasing l and decreasing r
    public static void reverse(int l, int r, int[] arr) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(l + 1, r - 1, arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        reverse(0, arr.length - 1, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
