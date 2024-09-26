public class Main {
    public static void main(String[] args) {
        System.out.print("23 in binary is = ");
        convertDecimalToBinary(23);
    }

    public static void convertDecimalToBinary(int N) {
        if(N == 0)
            return;
        convertDecimalToBinary(N/2);
        System.out.print(N%2);
    }
}