package naiveApproach;

public class ProblemTester {
    public static void main(String[] args) {
        int[] arr = {7,3,7,7,7};
        System.out.println(findOddOccurringNumber(arr, 5));
    }

    public static int findOddOccurringNumber(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count % 2 != 0)
                return arr[i];
        }
        return -1;
    }
}
