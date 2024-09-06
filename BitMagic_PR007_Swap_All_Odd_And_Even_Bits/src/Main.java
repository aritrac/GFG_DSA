import java.util.*;

class Solution {
    //Function to swap odd and even bits.
    public static int swapBits(int n) {
        // Your code
        for (int i = 0; i < 32; i += 2) {
            int i_bit = (n >> i) & 1; //Take the ith bit value
            int i_plus_1_bit = (n >> (i + 1)) & 1; //Take the i+1 bit value

            //remove the respective values of i and i_plus_1 bit from the number
            //then add the swapped values for those positions by adding them back in the reversed order
            n = n - (i_bit << i) - (i_plus_1_bit << (i + 1)) + (i_bit << (i + 1)) + (i_plus_1_bit << i);
        }
        return n;
    }
}

class BitWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            Solution obj = new Solution();

            System.out.println(obj.swapBits(n));
        }
    }
}