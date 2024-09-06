import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitMagic {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0){
            long n = Long.parseLong(read.readLine());

            if(new Solution().isPowerOfTwo(n))
                System.out.print("true");
            else
                System.out.println("false");
        }
    }
}

class Solution {
    public boolean isPowerOfTwo(long N){
        if(N == 0){
            return false;
        }
        return ((N & (N-1)) == 0);
    }
}
