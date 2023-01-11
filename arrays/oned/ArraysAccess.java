package arrays.oned;

public class ArraysAccess {

    /**
     * Suppose you want to store 5 integers together.
     * 1. How will you store it?
     * 2. Change value of element at index 1
     * 3. change value of element at index 2
     * 4. element at index 4 = element at index1 + element at index2
     * 5. Print the entire array
     */

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[1] = 4;
        arr[2] = 7;
        arr[4]  = arr[1]+arr[2];

        for(int i=0; i<5;i++){
            System.out.println(arr[i]);
        }

    }
}
