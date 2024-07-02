package naiveApproach;

/**
 * Problem: Count the number of trailing zeroes in factorial of n
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The number of trailing zeroes in factorial of 10 = " + countZeroes(10));
    }

    public static int countZeroes(int n){
        //first calculate the factorial of n
        int factorial = 1;
        for(int i = 2; i<=n; i++){
            factorial = factorial * i;
        }

        //Now count the number of trailing zeroes in the factorial calculated
        int res = 0;
        while(factorial % 10 == 0){
            res++;
            factorial = factorial / 10;
        }
        return res;
    }
}
