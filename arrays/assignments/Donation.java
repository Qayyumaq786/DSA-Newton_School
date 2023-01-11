package arrays.assignments;


import java.io.*; // for handling input/output
 import java.util.*; // contains Collections framework

// don't change the name of this class

// you can add inner classes if needed

/**

 curMinMoney = 3

 1 2 3 2 4 3 6 6 7 6
 0 0 0 1 0 1 0 0 0 1
 */


class Main {


    static long sumArray(int[] arr){
        long sum = 0;

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void solve(int[] arr){

        int[] extraAmount = new int[arr.length];
        int curMinMoney = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] >= curMinMoney){
                extraAmount[i] = 0;
                curMinMoney = arr[i];
            }
            else{
                extraAmount[i] = curMinMoney - arr[i];
            }
        }

        printArray(extraAmount);
        System.out.println();
        long collectedSum = sumArray(arr) + sumArray(extraAmount);
        System.out.println(collectedSum);
    }



    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solve(arr);
    }
}