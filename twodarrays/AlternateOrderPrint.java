package twodarrays;

public class AlternateOrderPrint {
    /**
     * given a 2d array, print it's alternate order traversal.
     *
     * example:
     * 1 2 3  -> 0
     * 4 5 6  -> 1
     * 7 8 9  -> 2
     *
     * print:
     * 1 2 3 6 5 4 7 8 9
     *
     */
    static void printAlternateOrder(int[][] arr){
        int n = arr.length; // number of rows
        int m = arr[0].length; // number of columns

        for(int i=0; i<n;i++){
            if(i%2==0){
                // print left to right
                for(int j=0; j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                // print right to left
                for(int j=m-1; j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
