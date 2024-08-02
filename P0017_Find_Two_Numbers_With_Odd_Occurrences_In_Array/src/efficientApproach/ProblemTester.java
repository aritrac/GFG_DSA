package efficientApproach;

public class ProblemTester {
    public static void main(String[] args) {
        int[] arr = {5,6,10,6,10,6,3,3};
        System.out.println("2 numbers with odd occurrences are as follows");
        findTwoNumsWithOddOccurrences(arr,8);
    }

    public static void findTwoNumsWithOddOccurrences(int[] arr, int N) {
        int x = arr[0];
        //XORing the entire array
        for (int i = 1; i < N; i++) {
            x = x ^ arr[i];
        }
        int k = x & (~(x - 1));

        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < N; i++) {
            if((arr[i] & k) == 0) // if the kth bit is 0
                result1 = result1 ^ arr[i];
            else
                result2 = result2 ^ arr[i];
        }
        System.out.print(" " + result1 + " " + result2);
    }
}
