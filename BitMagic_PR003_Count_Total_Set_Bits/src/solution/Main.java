package solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- > 0){
            n = sc.nextInt();
            System.out.println(Solution2.countSetBits(n));
        }
    }
}

//Naive Solution
class Solution {
    public static int countSetBits(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            int num = i;
            while(num > 0){
                count++;
                num = num & (num-1);
            }
        }
        return count;
    }
}

//Efficient Solution
class Solution2 {
    public static int countSetBits(int n){
        //Ignoring 0 as all bits are unset
        n+=1;
        int count = 0;

        //Counting set bits from 1 to n
        //Here x represents the bit position we are calculating for across the entire range of 1 to n
        //x = 2 means the second bit position from the right 2^1 = 2, position value is 1
        for(int x = 2; x/2 < n; x = x*2){
            //Total count of pairs of 0s and 1s
            int totalGroups = n/x;
            //totalGroups gives the complete count of pairs of 1s
            //now it will denote complete groups of only 1s
            //Multiplying it with the (current power of 2) will give
            //the count of 1s in the current bit position
            count += totalGroups * x/2;

            //if the count of pairs is odd then we add the remaining 1s
            //which couldnt be grouped together
            int remainingOnes = n % x;
            if(remainingOnes > x/2)
                count += remainingOnes - x/2;
        }
        //returning count of set bits
        return count;
    }
}
