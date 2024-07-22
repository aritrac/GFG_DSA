package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            Solution obj = new Solution();
            int N;
            N = sc.nextInt();
            System.out.println(obj.factorial(N));
        }
    }
}

class Solution {

    public long factorial(int N) {
        if(N < 0 || N > 18)
            return -1;
        if(N == 0)
            return 1;
        return N * factorial(N-1);
    }
}
