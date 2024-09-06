import java.util.*;

class Solution {
    public static int maxConsecutiveOnes(int N) {
        int longestSeq = 0;
        int maxSequence = -1;
        while(N != 0){
            if((N & 1) > 0){
                longestSeq++;
            }else{
                if(longestSeq > maxSequence){
                    maxSequence = longestSeq;
                }
                longestSeq = 0;
            }
            N = N >> 1;
        }
        return Math.max(longestSeq,maxSequence);
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        while (t-- > 0) {
            int n = sc.nextInt();//input n

            Solution obj = new Solution();

            //calling maxConsecutiveOnes() function
            System.out.println(obj.maxConsecutiveOnes(n));
        }
    }
}