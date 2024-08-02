package naiveApproach;

public class ProblemTester {
    public static void main(String[] args) {
        int[] arr = {3,4,3,4,5,4,4,6,7,7};
        System.out.println("The two numbers with odd count in the above array are : ");
        findNumbersWithOddCount(arr, 10);
    }

    public static void findNumbersWithOddCount(int[] arr, int N){
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < N; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count % 2 != 0)
                System.out.print(" " + arr[i]);
        }
    }
}
