package efficientApproach1;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The number of set bits in 40 = " + countSetBits(40));
    }

    public static int countSetBits(int N){
        int count = 0;
        while(N > 0){
            count++;
            N = N & (N-1); //This resets the last set bit, wherever it might occur
            //hence the loop runs, only no. of set bits times,
            //and hence the count reflects the number of set bits
        }
        return count;
    }
}
