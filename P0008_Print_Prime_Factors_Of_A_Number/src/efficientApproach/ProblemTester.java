package efficientApproach;

/**
 * Problem: Print the prime factors of a number
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.print("All the prime factors of 1031 are: ");
        printPrimeFactors(1035);
    }

    public static void printPrimeFactors(int n){
        if(n <= 1)
            return;
        for(int i = 2; i * i <= n; i++){
            if(isPrime(i)){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
        if(n > 1)
            System.out.println(n + " ");
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
