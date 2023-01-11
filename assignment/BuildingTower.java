package assignment;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BuildingTower {
    /**

     N = 5
     4 5 1 2 3

     reqDisk = 1

     {}
     _
     5 4
     _
     _
     3 2 1


     N= 5
     3 5 4 2 1

     reqDisk = 0
     {}

     _
     5
     4 3
     2
     1
     */

    static void solve(int[] arr){
        int reqDisk = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length;i++){
            pq.offer(arr[i]);

            while(!pq.isEmpty() && reqDisk==pq.peek()){
                System.out.print(pq.poll()+" ");
                reqDisk--;
            }

            System.out.println();
        }
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        solve(arr);
    }
}
