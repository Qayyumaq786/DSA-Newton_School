package advanceddsa.assignments;

import java.util.Scanner;

public class ReRooting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=1; i<=n;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if(n1!=-1){
                arr[i]++;
                arr[n1]++;
            }

            if(n2!=-1){
                arr[i]++;
                arr[n2]++;
            }
        }

        for(int i=2; i<=n;i++){
            if(arr[i] <= 2){
                System.out.print(i+" ");
            }
        }
    }
}
