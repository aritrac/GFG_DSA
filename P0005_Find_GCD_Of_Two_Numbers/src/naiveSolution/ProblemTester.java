package naiveSolution;

/**
 * Problem: Find the GCD of 2 numbers. Naive solution
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The GCD of 7 and 13 = " + gcd(7,13));
        System.out.println("The GCD of 4 and 6 = " + gcd(4,6));
        System.out.println("The GCD of 30 and 15 = " + gcd(30,15));
    }

    public static int gcd(int a, int b){
        //find the minimum of a and b
        int res = Math.min(a,b);

        //starting from the minimum, keep on decreasing its value, until
        //we find res, which divides both a and b, which is the GCD

        while(res > 0){
            if(a % res == 0 && b % res == 0){
                return res;
            }
            res--;
        }
        return res;
    }
}
