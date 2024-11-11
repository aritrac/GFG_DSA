package approach2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
    }

    public static int factorial(int N){
        if(N == 0)
            return 1;
        return N * factorial(N-1);
    }
}
