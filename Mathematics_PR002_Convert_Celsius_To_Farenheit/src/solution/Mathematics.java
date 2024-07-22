package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {
            Solution obj = new Solution();
            int C = sc.nextInt();
            System.out.println((int) obj.cToF(C));
            T--;
        }
    }
}

class Solution {
    public double cToF(int C) {
        if (C >= 0 && C <= 1000) {
            return ((double) 9 / 5) * C + 32;
        }
        return -1;
    }
}
