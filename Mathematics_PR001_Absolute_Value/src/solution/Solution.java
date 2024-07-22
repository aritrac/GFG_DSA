package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //No of test cases
        while(T > 0){
            int I = sc.nextInt();
            System.out.println(absolute(I));
            T--;
        }
    }

    public static int absolute(int I){
        if(I >= -1000000 && I <= 1000000){
            return Math.abs(I);
        }
        return -1;
    }
}
