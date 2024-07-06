package moreEfficientApproach;

/**
 * Problem: This method is almost similar to the previous approach, but with few optimizations implemented such as
 * The loop starts with 5, and gets incremented by 6
 * Also if the number is divisible by 2 or 3, before entering the loop, we return false
 */
public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Is 1031 prime? " + isPrime(1031));
        System.out.println("Is 22 prime? " + isPrime(22));
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
