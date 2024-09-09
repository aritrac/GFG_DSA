import java.util.*;

class Solution{

    //  Function to find the gray code of given number n
    public static int greyConverter(int n) {
        return n ^ (n >> 1);
    }

}

class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        while(t-->0){
            int n = sc.nextInt();//initializing n

            Solution obj = new Solution();

            //calling greyConverter() method
            System.out.println(obj.greyConverter(n));
        }
    }
}