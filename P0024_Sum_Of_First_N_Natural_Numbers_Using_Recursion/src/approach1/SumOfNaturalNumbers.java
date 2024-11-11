package approach1;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 natural numbers = " + findSum(10));
    }

    public static int findSum(int N){
        if(N == 0)
            return 0;
        return N + findSum(N-1);
    }
}
