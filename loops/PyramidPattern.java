package loops;

public class PyramidPattern {

    /**
     * Write a function which takes an input n,
     * and prints numbers between 1 to n on the same line.
     *
     * Input: int n
     * Output: void {Not returning anything}
     *
     */
    static void printNumberLine(int n){
        // n= 5
        // 1 2 3 4 5
        // n = 6
        // 1 2 3 4 5 6
        for(int i=1; i<=n ; i++){
            System.out.print(i+"\t");
        }
    }

    /**
     * Given number of rows, print this pattern
     * 1
     * 1    2
     * 1    2   3
     * 1    2   3   4
     * 1    2   3   4   5
     */
    static void printPyramidPattern(int rows){
        for(int i=1; i<=rows; i++){
            printNumberLine(i);
            System.out.println();
        }
    }



    public static void main(String[] args) {
        printPyramidPattern(5);
    }
}
