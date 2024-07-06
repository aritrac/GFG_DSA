package naiveApproach;

/**
 * Problem: Check if the given number is prime or not
 * Solution: We will use the naive approach to do the same
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Is 31 prime? " + isPrime(31));
        System.out.println("Is 22 prime? " + isPrime(22));
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
