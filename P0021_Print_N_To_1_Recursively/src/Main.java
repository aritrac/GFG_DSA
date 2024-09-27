public class Main {
    public static void main(String[] args) {
        System.out.println("Printing 10 to 1");
        recursivePrint(10);

        System.out.println("Printing 20 to 1");
        recursivePrint(20);
    }

    public static void recursivePrint(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        recursivePrint(n - 1);
    }
}