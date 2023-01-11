package assignment;

public class Knight {
    static int isValid(int x, int y){
        if(x<1 || y<1 || x>8 || y>8)
            return 0;
        else
            return 1;
    }

    static int Knight(int x, int y){
//Ener your code here
        int pos1 = isValid(x+1,y+2);
        int pos2 = isValid(x+1,y-2);
        int pos3 = isValid(x-1,y+2);
        int pos4 = isValid(x-1,y-2);
        int pos5 = isValid(x+2,y-1);
        int pos6 = isValid(x+2,y+1);
        int pos7 = isValid(x-2,y+1);
        int pos8 = isValid(x-2,y-1);

        return pos1+pos2+pos3+pos4+pos5+pos6+pos7+pos8;
    }
}
