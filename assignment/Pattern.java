package assignment;

public class Pattern {
    static void printRow(int row, int N){
        if(row==1){
            System.out.print("*");
        }
        else if(row==N){
            // print all *
            for(int i=0; i<=row; i++){
                System.out.print("*");
            }
        }
        else{
            for(int i=0; i<=row; i++){
                if(i==0 || i==row){
                    System.out.print("*");
                }
                else{
                    System.out.print("^");
                }
            }
        }
    }

    static void Pattern(int N){
//Enter your code here
        for(int i=1; i<=N;i++){
            printRow(i, N);
            System.out.println();
        }
    }
}
