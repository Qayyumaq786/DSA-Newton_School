package assignment;

import java.util.Scanner;

public class MatrixZigZagTraversal {

    static boolean checkValid(int row, int col, int n , int m){
        return !(row<0 || col <0 || row>=n || col>=m);
    }

    static void printSequence(int[][] arr,int row, int col, int n, int m){
        while(checkValid(row, col, n, m)){
            System.out.print(arr[row][col]+" ");
            row--;
            col++;
        }
        System.out.println();
    }

    static void printZigZag(int[][] arr, int n, int m){
        // Do traversal for all rows of 1st column
        for(int i=0; i<n;i++){
            printSequence(arr, i, 0,n,m);
        }

        // Traverse across the last row with the exception of first element
        for(int j=1; j<m;j++){
            printSequence(arr,n-1,j,n,m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printZigZag(arr,n,m);
    }

}
