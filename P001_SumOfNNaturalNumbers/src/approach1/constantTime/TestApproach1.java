package approach1.constantTime;

/*
Question: Find the sum of first N natural numbers
Description: We can do this in constant time if we directly use the formula

Sum = N*(N+1)/2
 */

public class TestApproach1 {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural numbers = " + sum(5));

        System.out.println("Sum of first 10 natural numbers = " + sum(10));
    }

    public static Integer sum(Integer n){
        return n*(n+1)/2;
    }
}
