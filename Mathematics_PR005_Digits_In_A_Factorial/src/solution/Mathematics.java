package solution;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            Factorial obj = new Factorial();
            int N = sc.nextInt();
            System.out.println(obj.digitsInFactorial(N));
        }
    }
}

class Factorial
{

    public int digitsInFactorial(int N)
    {
        if(N < 0)
            return -1;
        if(N < 1)
            return 1;
        double digits = 0;
        if(N <= 1000000){
            for(int i = 2; i <= N; i++){
                digits += Math.log10(i);
            }
        }
        return (int)Math.floor(digits + 1);
    }

}
