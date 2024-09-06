import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        //input number of testcases
        int t = sc.nextInt();
        int m, n;
        while (t-- > 0) {


            Solution obj = new Solution();
            //input m and n
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println(obj.posOfRightMostDiffBit(m, n));
        }
    }
}

class Solution {
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n) {
        if ((m < 0 || m > Math.pow(10, 9)) && (n < 0 || n > Math.pow(10, 9)) || (m == n))
            return -1;
        int k = m ^ n; // get the XOR, this will contain set bits where m and n differ
        k = (k & -k); // only get the rightmost set bit
        int count = 0;
        while (k != 0) { // get the position of the rightmost set bit
            count++;
            k = k >> 1;
        }

        return count;

    }
}