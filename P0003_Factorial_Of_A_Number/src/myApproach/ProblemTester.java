package myApproach;

/**
 * Problem0003: Find the factorial of a number
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The factorial of 4 = " + factorial(4));
        System.out.println("The factorial of 0 = " + factorial(0));
        System.out.println("The factorial of 1 = " + factorial(1));
        System.out.println("The factorial of 7 = " + factorial(7));
    }

    public static int factorial(int n){
        if(n < 0)
            return -1;
        if(n == 0 || n == 1)
            return 1;
        int factorial = 1;
        for(int i = 2;i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
