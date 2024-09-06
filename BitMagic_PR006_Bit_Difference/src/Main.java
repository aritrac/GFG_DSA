
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m, n;
        while (t-- > 0) {

            //input m and n
            m = sc.nextInt();
            n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.countBitsFlip(m, n));
        }
    }
}

class Solution {
    public static int countBitsFlip(int a, int b) {
        if ((a < 1 || a > Math.pow(10, 6)) || (b < 1 || b > Math.pow(10, 6)))
            return -1;
        int k = a ^ b; //getting total number of bits that needs to be flipped
        int count = 0;
        while (k != 0) {
            count++;
            k = k & (k - 1);
        }
        return count;
    }
}