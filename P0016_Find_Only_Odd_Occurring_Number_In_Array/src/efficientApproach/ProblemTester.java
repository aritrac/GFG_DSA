package efficientApproach;

//Efficient approach
public class ProblemTester {
    public static void main(String[] args) {
        int[] arr = {4,4,7,4,8,7,7,7,8};
        System.out.println("In the above array, the number occurring odd times = " + findNumberWithOddOccurrence(arr, 9));
    }

    public static int findNumberWithOddOccurrence(int[] arr, int N){
        int res = arr[0];
        for(int i = 1; i < N; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
