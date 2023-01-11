package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class EasySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] arr = new String[5];
        for(int i=0; i<n;i++){
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        for(String s: arr){
            System.out.print(s+" ");
        }
    }
}
