package naiveApproach1;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("The number of set bits in 40 = " + countSetBits(40));
        System.out.println("The number of set bits in 40 = " + countSetBitsMoreEfficient(40));
    }

    public static int countSetBits(int N){
        int count = 0;
        while(N > 0){
            if(N % 2 == 1){
                count++;
            }
            N = N/2;
        }
        return count;
    }

    public static int countSetBitsMoreEfficient(int N){
        int count = 0;
        while(N > 0){
            count = count + (N & 1);
            N = N/2;
        }
        return count;
    }
}
