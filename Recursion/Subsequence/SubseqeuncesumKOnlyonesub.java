package Recursion.Subsequence;

import java.util.*;

public class SubseqeuncesumKOnlyonesub {
    // technique of printing only one subsequence
    // if(base conditon is true)
    // then return false
    // if calling function is true in each case then it is
    // true then return true
    // if the case is that then it not call any further case then it will
    // return true;
    public static boolean prints(int ind, List<Integer> li, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (Integer a : li)
                    System.out.println(a + " ");
                return true;
            } else {
                return false;
            }
        }
        // the movement it is true return
        // true and coe out of loop
        li.add(arr[ind]);
        s += arr[ind];
        if (prints(ind + 1, li, s, sum, arr, n) == true) {
            return true;
        }
        s -= arr[ind];
        li.remove(li.size() - 1);
        if (prints(ind + 1, li, s, sum, arr, n) == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int n = 3;
        int sum = 2;
        List<Integer> li = new ArrayList<>();
        prints(0, li, 0, sum, arr, n);
    }
}
