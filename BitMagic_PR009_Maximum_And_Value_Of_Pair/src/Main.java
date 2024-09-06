
import java.io.*;


class Solution {

    // Function for finding maximum AND value.
    public static int maxAND(int arr[], int N) {
        //First check number of elements having their MSB set starting from the 31st to the 0th bit

        //This will store the MSB only if 2 or more elements have corresponding bit
        //positions set
        int resultingMaxPattern = 0;

        for (int i = 31; i >= 0; i--) {
            int count = 0;
            //concatenating with the existing pattern plus the new MSB that we need to search
            count = checkPattern(resultingMaxPattern | (1 << i), arr, N);

            if (count >= 2) //if there are two or more elements having the set bit positions identical, we can add
            //that bit position to the result
            {
                resultingMaxPattern = resultingMaxPattern | (1 << i);
            }
        }

        return resultingMaxPattern;
    }

    static int checkPattern(int setMSBPattern, int[] arr, int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if ((arr[i] & setMSBPattern) == setMSBPattern) { //Checking how many elements have setMSBPattern set
                count++;
            }
        }
        return count;
    }

}


class BitWise {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        System.out.println("Value of t = " + t);
        while (t-- > 0) {
            //input size of array
            int n = Integer.parseInt(br.readLine());
            System.out.println("Value of array size = " + n);
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[n];

            //inserting elements in the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();

            //calling maxAND() method of class AND
            System.out.println(obj.maxAND(arr, n));
        }
    }
}

