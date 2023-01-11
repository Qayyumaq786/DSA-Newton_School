package advanceddsa.assignments;

import java.util.Scanner;

public class MaxString {

    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    static int maxString(String s, int k){
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] maxValue = new int[1];
        maxStringUtil(arr, k, maxValue);
        return maxValue[0];
    }

    static void maxStringUtil(char[] arr, int k, int[] maxValue){

        int number = Integer.parseInt(new String(arr));
        if(maxValue[0] < number){
            maxValue[0] = number;
        }

        if(k==0){
            return;
        }

        for(int i = arr.length-1; i>0; i--){
            for(int j= i-1; j>=0; j--){
                swap(arr, i, j);
                maxStringUtil(arr, k-1, maxValue);
                swap(arr, i, j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(maxString(s,k));
    }

}
