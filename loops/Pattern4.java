package loops;

public class Pattern4 {


    /**
     *      int n = 5
     *
     *      5432112345
     *
     *      n = 4
     *      43211234
     */
    static void printPattern(int n){
        for(int i=n; i>=1; i--){
            System.out.print(i);
        }

        for(int i=1; i<=n;i++){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        printPattern(6);
    }
}
