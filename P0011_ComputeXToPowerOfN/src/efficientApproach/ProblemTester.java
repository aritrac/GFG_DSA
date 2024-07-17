package efficientApproach;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("\n2 to the power of 7 = " + power(2, 7));
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        int temp = power(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
