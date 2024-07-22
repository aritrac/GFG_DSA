package efficientApproach;

/**
 * Problem: Check if the kth bit in an integer is set or not
 */

public class ProblemTester {
    public static void main(String[] args) {
        int N = 4;
        int k = 3;

        System.out.println(isSet(N,k));
    }

    public static boolean isSet(int N, int k){
        return (N & (1 << (k-1))) != 0;
    }
}
