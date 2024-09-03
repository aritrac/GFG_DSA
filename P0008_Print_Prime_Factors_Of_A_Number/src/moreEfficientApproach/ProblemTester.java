package moreEfficientApproach;

/**
 * Problem: Find the prime factors of a given number n
 */
public class ProblemTester {
    public static void main(String[] args) {
        System.out.print("All the prime factors of 1031 are: ");
        printPrimeFactors(1035);
    }

    public static void printPrimeFactors(int n){
        if(n <= 1)
            return;
        //Removing all the powers of 2 from the number
        while(n % 2 == 0){
            System.out.print("2 ");
            n = n / 2;
        }
        //Removing all the powers of 3 from the number
        while(n % 3 == 0){
            System.out.print("3 ");
            n = n / 3;
        }
        for(int i = 5; i * i <= n; i+= 6){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
            while(n % (i+2) == 0){
                System.out.print((i+2) + " ");
                n = n / (i+2);
            }
        }
        if(n > 3) //as other factors are already handled for 2 and 3 before we enter the loop,
            //so if there are any remaining factor, then it has to be either 1 or greater than 3
            System.out.print(n);
    }
}
