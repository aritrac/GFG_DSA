package efficientApproach2;

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

        return (N >> (k-1) & 1) != 0;
    }
}
