package solution;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(Soln.getFirstSetBit(n));
        }
    }
}

class Soln{
    public static int getFirstSetBit(int n){
        int k = (n & (~(n-1)));
        int count = 0;
        while(k != 0){
            count++;
            k = k >> 1;
        }
        return count;
    }
}
