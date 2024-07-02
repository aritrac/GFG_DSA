package efficientApproach;

/**
 * Problem: Count the number of trailing zeroes in a factorial of a number
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The number of trailing zeroes in factorial of 135 = " + countTrailingZeroes(135));
    }

    public static int countTrailingZeroes(int n){
        int res = 0;
        for(int i = 5; i <= n; i = i * 5){
            res = res + n/i;
        }
        return res;
    }
}
