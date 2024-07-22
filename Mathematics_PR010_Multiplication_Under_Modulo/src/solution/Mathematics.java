package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(Solution.multiplicationUnderModulo(a,b));
        }
    }
}

class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        if(a >= 1 && b >=1){
            return ((a % 1000000007) * (b % 1000000007)) % 1000000007;
        }
        return -1;
    }
}
