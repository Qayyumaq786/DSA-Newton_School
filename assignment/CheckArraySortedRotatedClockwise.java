package assignment;

import java.util.Scanner;

public class CheckArraySortedRotatedClockwise {


    static boolean isRotatedIncreasingOrder(int[] arr){
        int decrementCount = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                decrementCount++;
            }

        }

        return decrementCount==1;
    }

    static boolean isRotatedDecrementOrder(int[] arr){
        int incrementCount = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                incrementCount++;
            }
        }

        return incrementCount==1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int p=1; p<=t;p++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }

            if(arr[0]>arr[n-1] && isRotatedIncreasingOrder(arr) ){
                System.out.println("Yes");
            }
            else if(arr[0]<arr[n-1] && isRotatedDecrementOrder(arr)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
