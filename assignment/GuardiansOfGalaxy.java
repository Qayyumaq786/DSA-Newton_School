package assignment;

import java.util.Scanner;

public class GuardiansOfGalaxy {
    static boolean isValidThrust(int[] arr , long thrust){
        for(int i=0; i<arr.length;i++){
            thrust = 2*thrust - arr[i];
            if (thrust>=Integer.MAX_VALUE) return true;

            if(thrust<0){
                return false;
            }
        }
        return true;
    }

    static long binarySearch(int[] arr){
        long low = 1;
        long high = Integer.MAX_VALUE;
        long ans = 0;
        while(low<=high){
            long mid = (low+high)/2;
            if(isValidThrust(arr, mid)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }


    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(arr));
    }
}
