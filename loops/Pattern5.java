package loops;

public class Pattern5 {

    /**
     *      int n = 6
     *      012345
     *      $#$#$#
     *
     *      int n = 7
     *      $#$#$#$
     */
    static void printPattern(int n){
        for(int i=1; i<=n;i++){
            if(i%2==0){
                System.out.print("#");
            }
            else{
                System.out.println("$");
            }
        }
    }


    public static void main(String[] args) {

    }
}
