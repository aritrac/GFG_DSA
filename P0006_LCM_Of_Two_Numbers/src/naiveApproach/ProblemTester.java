package naiveApproach;

/**
 * Problem: Find the LCM of 2 numbers. Naive solution
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The LCM of 4 and 6 = " + lcm(4,6));
        System.out.println("The LCM of 13 and 17 = " + lcm(13,17));
        System.out.println("The LCM of 25 and 40 = " + lcm(25,40));
    }

    public static int lcm(int a, int b){
        int res = Math.max(a,b);
        while(true){
            if(res % a == 0 && res % b == 0){
                return res;
            }
            res++;
        }
    }
}
