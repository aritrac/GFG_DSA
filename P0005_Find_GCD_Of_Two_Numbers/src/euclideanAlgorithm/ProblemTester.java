package euclideanAlgorithm;

/**
 * Problem: Find the GCD of 2 numbers. Euclidean algorithm
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The GCD of 7 and 13 = " + gcdUnoptimized(7, 13));
        System.out.println("The GCD of 4 and 6 = " + gcdUnoptimized(4, 6));
        System.out.println("The GCD of 30 and 15 = " + gcdUnoptimized(30, 15));


        System.out.println("The GCD of 7 and 13 = " + gcdOptimized(7, 13));
        System.out.println("The GCD of 4 and 6 = " + gcdOptimized(4, 6));
        System.out.println("The GCD of 30 and 15 = " + gcdOptimized(30, 15));
    }

    //Use repeated subtraction
    public static int gcdUnoptimized(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //Uses modular division
    public static int gcdOptimized(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcdOptimized(b, a % b);
    }
}
