package naiveApproach;

/**
 * Problem: Print all the divisors of n using a naive approach
 * This will print out the divisors in a sorted fashion
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.print("The divisors of 1045 are ");
        printDivisors(1045);
    }

    public static void printDivisors(int n){
        for(int i = 1; i<= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
