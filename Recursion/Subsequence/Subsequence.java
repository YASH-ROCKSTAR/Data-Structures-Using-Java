package Recursion.Subsequence;

import java.util.*;

public class Subsequence {
    public static void sub(int ind, List<Integer> li, int[] arr, int n) {
        if (ind >= n) {
            for (Integer c : li) {
                System.out.println(c + " ");
            }
            if (li.size() == 0) {
                System.out.print(li + " ");
            }
            return;
        }
        // take
        li.add(arr[ind]);
        sub(ind + 1, li, arr, n);

        // not take
        li.remove(arr[ind]);
        sub(ind + 1, li, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        List<Integer> li = new ArrayList<>();
        int n = 3;
        sub(0, li, arr, n);
    }
}
