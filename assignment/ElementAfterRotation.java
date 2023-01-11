package assignment;

import java.util.Scanner;

public class ElementAfterRotation {

    /**
     * 5 2
     * 1 2 3 4 5
     * 2
     * 1 3
     * 1 4
     *
     *
     * 1 2 3 4 5
     * 3 1 2 4 5
     *
     * 1-> 0 3 -> 2
     *
     * */

    static void rotateSubarray(int[] arr, int l, int r){
        int temp = arr[r];

        for(int i= r; i>l ;i--){
            arr[i] = arr[i-1];
        }
        arr[l] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for(int i=0; i<m;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            rotateSubarray(arr, l-1,r-1);
        }

        System.out.println(arr[x]);
    }
}
