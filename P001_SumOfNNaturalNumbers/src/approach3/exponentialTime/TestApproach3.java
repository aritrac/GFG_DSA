package approach3.exponentialTime;

/*
Question: Find the sum of first N natural numbers
Description: We can do this in exponential time if we run a loop from 1 to N
and then inside the loop, we will again loop for 1 to i
and then increment sum by 1, i times
 */

public class TestApproach3 {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural numbers = " + sum(5));

        System.out.println("Sum of first 10 natural numbers = " + sum(10));
    }

    public static Integer sum(Integer n) {
        Integer sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }
}
