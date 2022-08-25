package Recursion;

//functional recursion
public class Sumoffirstnumberusingfunctional {
    // calling function with passing 3 in f(3)
    // then it check bse confiton
    // then calling function and it wil be 3+f(2)
    // and and then f(2) is call
    // it call 2+g(1)
    // the f(1) will call again
    // and call 1+f(0) the again
    // call f(0) and when it first cjheck base conditon
    // then frolm therre it retrun
    // give 0+1=1 and 2+1=3 then 3+3=6 return 6
    static int f(int n) {
        if (n == 0) {
            return 0;
        }
        return n + f(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(f(n));
    }
}
