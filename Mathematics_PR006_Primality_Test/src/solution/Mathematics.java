package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            Solution obj = new Solution();
            int N = sc.nextInt();
            System.out.println(obj.isPrime(N));
        }
    }
}

class Solution {
    public boolean isPrime(int N) {
        if(N == 1)
            return false;
        if(N == 2 || N == 3)
            return true;
        if(N < 1)
            return false;
        if(N % 2 == 0 || N % 3 == 0)
            return false;
        for(int i = 5; i*i <= N; i+=6){
            if(N % i == 0 || N % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
