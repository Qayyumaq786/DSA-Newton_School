package assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GroupOfNumbers {

    static void solve(int[] arr){
        // compute the occurrence of each number
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i:arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        /**
         * 1 3 3 4 4 4
         *
         * 1->1
         * 2->2
         * 3->3
         *    0th->key  1st-> value
         *   [1,1]
         *   [3,2]
         *   [4,3]
         * */
        int[][] hmArray = new int[hm.size()][2];
        int index = 0;
        for(int key: hm.keySet()){
            hmArray[index][0] = key;
            hmArray[index][1] = hm.get(key);
            index++;
        }

        // Read about lambda expressions
        Arrays.sort(hmArray, (a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(b[1],a[1]);
            }
            else{
                return Integer.compare(b[0],a[0]);
            }
        });

        for(int[] a: hmArray){
            System.out.print(a[0]+" ");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        solve(arr);
    }
}
