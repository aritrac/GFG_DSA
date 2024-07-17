package approach;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("3 raised to the power of 19 = " + power(3, 19));
    }

    public static int power(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) { //bit is 1
                res = res * x;
            }
            x = x * x;// keeping the power value based on bit position ready to be multiplied if bit is 1
            //for example, as long as the loop runs from say 0 to 4,
            //x will assume values x^2,x^4,x^8,x^16, and whenever the bit is 1, we multiply whatever is the value
            //of x in that iteration
            n = n / 2;
        }
        return 0;
    }
}
