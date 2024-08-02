package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int n;
    static int k;

    //Driver Code
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t > 0){
            n = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());

            if(CheckBit.checkKthBit(n,k))
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
}

class CheckBit{
    static boolean checkKthBit(int n, int k){
        return ((n & (1 << k)) != 0);
    }
}
