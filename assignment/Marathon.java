package assignment;
import java.util.*;

public class Marathon {
    static boolean validCheckpoint(int[][] arr, int index){
        int energy = 0;
        int curIndex = index;
        int n = arr.length;
        int reqIndex = (index-1+arr.length)%n;

        while(curIndex!=reqIndex){
            energy += arr[curIndex][0];

            energy -= arr[curIndex][1];

            if(energy<0)
                return false;

            curIndex = (curIndex+1)%n;
        }

        return true;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int ans = -1;
        for(int i=0; i<n;i++){
            if(validCheckpoint(arr,i)){
                ans = i+1;
                break;
            }
        }
        System.out.println(ans);
    }
}
