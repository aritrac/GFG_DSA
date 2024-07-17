package naiveApproach;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("3 to the power of 4 = " + power(3, 4));
    }

    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }
}
