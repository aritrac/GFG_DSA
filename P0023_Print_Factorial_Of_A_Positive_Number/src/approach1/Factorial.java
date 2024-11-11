package approach1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5,1));
    }

    public static int factorial(int N, int k){
        if(N == 0)
            return k;
        return factorial(N-1, k * N);
    }
}
