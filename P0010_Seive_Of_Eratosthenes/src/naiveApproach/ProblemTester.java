package naiveApproach;

public class ProblemTester {
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

    public static void main(String[] args) {
        System.out.println("All prime numbers upto 100 are as follows");
        printPrimes(100);
    }

    public static void printPrimes(int n){
        for(int i = 2; i <=n; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
}
