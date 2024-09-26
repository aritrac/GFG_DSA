public class Main {
    public static void main(String[] args) {
        System.out.println("Floor of Log Base 2 of 16 = " + findFloorOfLogBase2OfN(16));
        System.out.println("Floor of Log Base 2 of 17 = " + findFloorOfLogBase2OfN(17));
        System.out.println("Floor of Log Base 2 of 18 = " + findFloorOfLogBase2OfN(18));
        System.out.println("Floor of Log Base 2 of 19 = " + findFloorOfLogBase2OfN(19));
        System.out.println("Floor of Log Base 2 of 20 = " + findFloorOfLogBase2OfN(20));
        System.out.println("Floor of Log Base 2 of 32 = " + findFloorOfLogBase2OfN(32));
    }

    public static int findFloorOfLogBase2OfN(int N) {
        if(N == 1)
            return 0;
        return 1 + findFloorOfLogBase2OfN(N/2);
    }
}