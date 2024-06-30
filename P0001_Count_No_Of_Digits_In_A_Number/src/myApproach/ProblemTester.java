package myApproach;

/**
 * Problem0001: Count the number of digits in a number
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Number of digits in 9268 = " + countDigits(9268));
    }

    public static Integer countDigits(Integer number){
        int numOfDigits = 0;
        while(number > 0){
            number = number / 10;
            numOfDigits ++;
        }
        return numOfDigits;
    }
}
