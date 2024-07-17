package efficientApproach;

/**
 * Problem: Print all the divisors of a number using an efficient approach
 * This will not print out the divisors in a sorted fashion
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.print("The divisors of 1045 are ");
        printDivisors(1045);
    }

    public static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) { //Checking if we are printing square root of a number twice or not
                    //for example, when i is 5 and n is 25, then 5 should not be printed twice
                    //this condition takes care of that
                    System.out.print(n / i + " ");
                }
            }
        }
    }
}
