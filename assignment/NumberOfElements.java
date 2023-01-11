package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfElements {
    static int bs(int[] arr, int el){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == el){
                return mid;
            }
            else if(arr[mid] > el){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return high;
    }




    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int k = sc.nextInt();
        while(k--!=0){
            int el = sc.nextInt();
            int index = bs(arr, el);

            // 1 2 3 4 5    el = 2
            int ans = arr.length - index - 1;
            System.out.println(ans);
        }

    }
}
