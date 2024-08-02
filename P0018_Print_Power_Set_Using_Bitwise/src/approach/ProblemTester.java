package approach;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Print unique combinations of the string 'public'");
        String s = "public";
        printPowerSetCombinationsOfString(s);
    }

    public static void printPowerSetCombinationsOfString(String s){
        int len = s.length();
        int powerOfTwoOfLen = 1 << len; //if len is 5, give 2^5 which is 32
        for(int i = 0; i < powerOfTwoOfLen; i++){
            for(int j = 0; j < len; j++){ // this loop is the number of bits representing the value of i which is len
                if((i & (1 << j)) != 0){ // finding the set bit positions of i
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
