package moreEfficientApproach;

/**
 * Problem: Print the divisors of a number n in a sorted manner
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.print("the divisors of n in sorted manner = ");
        printDivisorsSorted(1045);
    }

    public static void printDivisorsSorted(int n){
        int i;
        //Prints all divisors from 1 to root of n in sorted manner
        for(i = 1; i * i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        //Prints all divisors from root of n to n in sorted manner
        for(; i>=1; i--){
            if(n % i == 0){
                System.out.print(n/i + " ");
            }
        }
    }
}
