package solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Mathematics {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0)
        {
            Solution  obj=new Solution();
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            obj.quadraticRoots(a,b,c);
            System.out.println();
        }

    }
}

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        if(a >= -1000 && a <= 1000 && b >= -1000 && b <= 1000 && c >= -1000 && c <= 1000){
            if(b*b - 4*a*c < 0) {
                System.out.print("Imaginary");
                return new ArrayList<>();
            }
            double d = 0.0d;
            if(b*b - 4*a*c > 0)
                d = Math.sqrt(b*b - 4*a*c);

            int root1 = (int)Math.floor((-b - d)/(2*a));
            int root2 = (int)Math.floor((-b + d)/(2*a));
            ArrayList<Integer> valList = new ArrayList<>();
            valList.add(Math.max(root1,root2));
            valList.add(Math.min(root1,root2));
            return valList;
        }
        return new ArrayList<>();
    }
}
