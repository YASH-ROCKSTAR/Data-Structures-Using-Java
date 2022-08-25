package Recursion;

public class SumOffirstNumber {

    // so aasume passing f(3,0)
    // so next time it check if i<1 no not less than one
    // so next time we saw function call will be there f(2,0+3=3)
    // next time aain check base condition
    // then calling f(1,3+2=5)
    // again chcecking vbase condition
    // calling function f(0,5+1=6)
    // as it see i<1 it retrun sum 6 and all the function call will be removed
    // from the stack
    static void f(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        f(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 5;
        f(n, 0);

    }

}
