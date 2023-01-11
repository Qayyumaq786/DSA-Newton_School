package loops;

public class Pattern3 {

    /**
     * Input = n
     *
     *
     *
     * n = 4
     *       1    row = 1  spaces = 3    (n-row) spaces
     *      21    row = 2  spaces = 2
           321    row = 3  spaces = 1
          4321    row = 4  spaces = 0

          sub-problems:
            write a printRow fn, and call this for each row

          If we talk about each row:
            There is a space, following which there is a number
            component.

            PrintRow function: Given n, row number
            print n-row spaces followed by remaining
     */

    static void printRow(int n, int row){
        // n = 4 row = 2
        // lets print spaces
        for(int i=1; i<=n-row;i++){
            System.out.print(" ");
        }

        // lets print numbers
        for(int i = row; i>=1; i--){
            System.out.print(i);
        }
    }

    static void printPattern(int n){
        for(int i=1; i<=n; i++){
            printRow(n,i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
