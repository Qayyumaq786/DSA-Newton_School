package assignment;

import java.util.Scanner;

public class BoundaryTraversal {

    static void printLeftToRight(int[][] arr, int row, int col1, int col2){
        for(int i=col1; i<=col2; i++){
            System.out.print(arr[row][i]+" ");
        }
    }

    static void printRightToLeft(int[][] arr, int row, int col1, int col2){
        for(int i=col2; i>=col1; i--){
            System.out.print(arr[row][i]+" ");
        }
    }

    static void printTopToDown(int[][] arr, int col, int row1, int row2){
        for(int i=row1; i<=row2; i++){
            System.out.print(arr[i][col]+" ");
        }
    }

    static void printDownToTop(int[][] arr, int col, int row1, int row2){
        for(int i=row2; i>=row1; i--){
            System.out.print(arr[i][col]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int p=1; p<=t;p++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];

            for(int i=0; i<n;i++){
                for(int j=0; j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            printLeftToRight(arr, 0, 0, m-1);
            printTopToDown(arr, m-1, 1, n-1);

            if(n>1)
                printRightToLeft(arr, n-1, 0, m-2);

            if(m>1)
                printDownToTop(arr, 0, 1, n-2);

            System.out.println();
        }
    }



}
