package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            Solution obj = new Solution();
            int N = sc.nextInt();
            System.out.println(obj.exactly3Divisors(N));
        }
    }
}

class Solution
{

    public int exactly3Divisors(int N)
    {
        if(N <1 || N > 1000000000)
            return -1;
        boolean[] prime = new boolean[(int)Math.sqrt(N) + 1];
        Arrays.fill(prime,true);
        int count = 0;
        for(long i = 2; i * i <= N; i++) {
            if (prime[(int)i]) {
                count++;
                //set all multiples of i
                for (long j = i * 2; j * j <= N; j += i) {
                    prime[(int)j] = false;

                }
            }
        }
        return count;
    }
}

