package myApproach;

/**
 * Problem0002: Find if a number is palindrome or not?
 */

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Is 367 palindrome? " + isPalindrome(367));
        System.out.println("Is 76867 palindrome? " + isPalindrome(76867));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;
        while(originalNumber > 0){
            reverse = reverse * 10 + originalNumber % 10;
            originalNumber = originalNumber / 10;
        }
        return reverse == number;
    }
}
