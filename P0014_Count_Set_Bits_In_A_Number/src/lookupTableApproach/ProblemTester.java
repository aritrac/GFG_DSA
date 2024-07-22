package lookupTableApproach;

public class ProblemTester {
    public static void main(String[] args) {
        initialize();
        System.out.println("The number of set bits in 40 = " + countSetBits(40));
    }

    static int[] table = new int[256]; //creating the table, to store number of set bits in numbers from 0 to 255

    public static void initialize(){
        table[0] = 0; //initializing the first position to 0
        for(int i = 1; i <= 255; i++){
            table[i] = table[i & (i-1)] + 1; //Using Brian Kerninghams algorithm
        }
    }

    public static int countSetBits(int N){
        int x = 255; //least 8 bits set to 1 => 11111111
        return table[N & x] + table[(N >> 8) & x] + table[(N >> 16) & x] + table[(N >> 24)]; //checking the count of
        //all 32 bits, 8 bits at a time
        //In case of 24, we don't need x anymore, as those are the only remaining group of bits to be checked
    }
}
