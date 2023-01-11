package basics;

public class NestingOfLoops {
    public static void main(String[] args) {
        /**

         ####
         ####
         ####
         ####

         For brute force (easiest solution)
         1. repeated print commands for each row.

         */

        // brute force
//        System.out.println("####");
//        System.out.println("####");
//        System.out.println("####");
//        System.out.println("####");


        // First improvement
//        for(int i=1; i<=4; i++){
//            System.out.print("####\n");
//        }

        // Repetition at column level
        for(int i=1; i<=4; i++){ // for each row

            for(int j=1; j<=4;j++){ // for each column in a row
                System.out.print("#");
            }
            System.out.println();
        }

        /**
         * Take input of 2 integers n and m.
         * and print a grid of # with n rows and m columns.
         *
         * example:
         * n = 3 m=2
         *
         * Output:
         *  ##
         *  ##
         *  ##
         */
    }
}
