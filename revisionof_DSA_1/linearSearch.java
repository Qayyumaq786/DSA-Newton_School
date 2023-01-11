package revisionof_DSA_1;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int t=sc.nextInt();
        for (int i=0;i<n;i++){
            if(arr[i]==t){
                System.out.println(i);
            }
        }
    }
}

