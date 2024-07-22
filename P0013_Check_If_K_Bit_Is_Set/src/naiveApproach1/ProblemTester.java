package naiveApproach1;

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
        int x = 1;
        for(int i = 0; i < (k-1); i++){
            x = x * 2;
        }
        return (N & x) != 0;
    }
}
