public class Main {
    public static void main(String[] args) {
        System.out.println("Printing 1 to 10");
        recursivePrint(10);
    }

    public static void recursivePrint(int n) {
        if(n == 0) {
            return;
        }
        recursivePrint(n - 1);
        System.out.println(n);
    }
}