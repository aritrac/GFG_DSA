package naiveSolution;

//Naive approach

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Is 8 a power of 2? " + isPow2(8));
        System.out.println("Is 12 a power of 2? " + isPow2(12));
    }

    public static Boolean isPow2(int N){
        if(N == 0)
            return false;
        while(N != 1){
            if(N % 2 != 0)
                return false;
            N = N/2;
        }
        return true;
    }
}
