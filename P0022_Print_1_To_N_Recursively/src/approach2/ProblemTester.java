package approach2;

public class ProblemTester {
    public static void main(String[] args) {
        System.out.println("Printing 1 to 10");
        recursivePrint(10,1);
    }

    public static void recursivePrint(int N, int k){
        if(N == 0){
            return;
        }
        System.out.println(k);
        recursivePrint(N - 1, k + 1); //Tail recursive [Parent doesn't do anything, once child returns
        // and this is optimized for modern compilers ]
    }
}
