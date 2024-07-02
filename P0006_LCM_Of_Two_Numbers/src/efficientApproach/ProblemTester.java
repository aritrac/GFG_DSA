package efficientApproach;

/**
 * Problem: Find LCM of 2 numbers using Euclidean algorithm
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The LCM of 4 and 6 = " + lcm(4, 6));
        System.out.println("The LCM of 13 and 17 = " + lcm(13, 17));
        System.out.println("The LCM of 25 and 40 = " + lcm(25, 40));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
