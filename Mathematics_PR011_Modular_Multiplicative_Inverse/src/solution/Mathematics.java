package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            Solution obj = new Solution();
            int a = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(obj.modInverse(a,m));
        }
    }
}

class Solution
{

    public int modInverse(int a, int m)
    {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return -1;
    }

}
