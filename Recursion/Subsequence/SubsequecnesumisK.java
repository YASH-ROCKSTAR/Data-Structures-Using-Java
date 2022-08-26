package Recursion.Subsequence;

import java.util.*;

public class SubsequecnesumisK {

    public static void print(int ind, List<Integer> li, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (Integer c : li) {
                    System.out.println(c + " ");
                }

            }
            return;
        }
        li.add(arr[ind]);
        s += arr[ind];
        print(ind + 1, li, s, sum, arr, n);
        s -= arr[ind];
        li.remove(li.size() - 1);
        print(ind + 1, li, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int n = 3;
        int sum = 2;
        List<Integer> li = new ArrayList<>();
        print(0, li, 0, sum, arr, n);
    }
}
