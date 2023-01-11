package revisionof_DSA_1;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static int binary_Search(int arr[],int t){
        int st=0;
        int end=arr.length;
        while (st<end){

            int mid=arr[st+end/2];
            if(mid==t){
                return st+end/2;
            }
            else if (mid>t){
                end--;
            }
            else {
                st++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int t=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(binary_Search(arr,t));

    }
}
