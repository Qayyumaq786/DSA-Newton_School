package assignment;

import java.util.Scanner;

public class PrintSquaredSortedArray {
    static int findFirstPositive(int[] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i] >=0)
                return i;
        }
        return arr.length;
    }

    static void solve(int[] arr){
        int ptr2 = findFirstPositive(arr);
        int ptr1 = ptr2-1;

        while(ptr1>=0 && ptr2<arr.length){
            int sq1= arr[ptr1]*arr[ptr1];
            int sq2= arr[ptr2]*arr[ptr2];

            if(sq1<sq2){
                System.out.print(sq1+" ");
                ptr1--;
            }
            else{
                System.out.print(sq2+" ");
                ptr2++;
            }
        }

        while(ptr1>=0){
            int sq1= arr[ptr1]*arr[ptr1];
            System.out.print(sq1+" ");
            ptr1--;
        }

        while(ptr2<arr.length){
            int sq2= arr[ptr2]*arr[ptr2];
            System.out.print(sq2+" ");
            ptr2++;
        }

    }

    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i]=sc.nextInt();
            }

            solve(arr);
            System.out.println();
        }
    }
}
