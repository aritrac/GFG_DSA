package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            Solution obj = new Solution();

            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            System.out.println((int)Math.floor(obj.termOfGP(A, B, N)));
        }
    }
}

class Solution {

    public double termOfGP(int A, int B, int N) {
        if(A >= -100 && A <= 100 && B >= -100 && B <= 100 && N >=1 && N <=5){
            if(N == 1)
                return A;
            if(N == 2)
                return B;
            double commonRatio = (double) B /A;
            return (A * Math.pow(commonRatio, N - 1));
        }
        return -1;
    }

}
