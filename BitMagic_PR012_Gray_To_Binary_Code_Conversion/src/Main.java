
import java.util.*;

class Solution{

    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        int binary = n;
        while(n > 0){
            n = n >> 1;
            binary = binary ^ n;
        }
        return binary;
    }

}



//{ Driver Code Starts.

class GFG {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        while(t-->0){
            int n = sc.nextInt();//initializing n

            Solution obj = new Solution();

            //calling grayToBinary() function
            System.out.println(obj.grayToBinary(n));
        }
    }
}

// } Driver Code Ends