package mostEfficientAndShorter;

import java.util.Arrays;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("All prime numbers below 100 are as follows");
        sieve(100);
    }

    public static void sieve(int n) {
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false; //marking position 0 and 1 as false, as we dont consider 0 and 1 in prime numbers

        for (int i = 2; i <= n; i++) { //checking prime numbers upto square root of n
            if (isPrime(i)) {
                System.out.print(i + " ");
                //here we are starting with i * i, instead of i * 2
                for (int j = i * i; j <= n; j = j + i) { //marking all multiples of i <=n as false
                    sieve[j] = false;
                }
            }
        }
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
