package loops;

public class Pattern2 {

    /**
     * Given n, print pattern of
     *  1 to n and n-1 to 1
     *
     *  n = 5
     *  1 2 3 4 5 4 3 2 1
     *
     * Subproblems:
     * 1. 1 to n
     * 2. n-1 to 1
     */
    static void printPattern(int n){
        printForward(n);
        printReverse(n-1);
    }

    /**
     * Input: int n
     * Output: void
     *
     * 1 to n
     */
    static void printForward(int n){
        for(int i=1; i<=n; i++)
            System.out.print(i+"\t");
    }

    /**
     * Give n
     * print n to 1
     */
    static void printReverse(int n){
        for(int i=n ; i>=1; i--){
            System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
