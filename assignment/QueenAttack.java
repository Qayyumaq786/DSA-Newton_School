package assignment;

public class QueenAttack {
    /**
     X==P  // same column

     Y==Q // same row


     Y-X == Q-P // diagonal

     x= 3
     y =2

     p = 4
     q = 1

     p-x = y-q // off diagonal
     */


    static int QueenAttack(int X, int Y, int P, int Q){
//Enter your code here
        if(X==P) {
            return 1;
        }
        else if(Y==Q){
            return 1;
        }
        else if(Y-X == Q-P){
            return 1;
        }
        else if(P-X == Y-Q){
            return 1;
        }
        else{
            return 0;
        }
    }
}
