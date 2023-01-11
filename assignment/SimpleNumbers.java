package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleNumbers {

    static int getMinGroups(int[] arr, int target){
        Arrays.sort(arr);
        int ptr1 =0, ptr2 = arr.length-1;
        int count =0;
        while(ptr1 <= ptr2){

            int sum = arr[ptr2]+ arr[ptr1];
            if(ptr1==ptr2){
                sum -= arr[ptr2];
            }
            if(sum <= target){
                ptr2--;
                ptr1++;
            }
            else{
                ptr2--;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int minGroups = getMinGroups(arr, target);
        System.out.println(minGroups);
    }

}
