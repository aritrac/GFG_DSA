package approach2.linearTime;

/*
Question: Find the sum of first N natural numbers
Description: We can do this in linear time if we run a loop from 1 to N
and add each of them to the Sum variable
 */

public class TestApproach2 {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural numbers = " + sum(5));

        System.out.println("Sum of first 10 natural numbers = " + sum(10));
    }

    public static Integer sum(Integer n){
        Integer sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
