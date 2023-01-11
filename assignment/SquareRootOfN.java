package assignment;

import java.util.Scanner;

public class SquareRootOfN {
    static long bs(int n){
        long low =1;
        long high = n;

        while(low<=high){
            long mid = (low+high)/2;

            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid > n){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            System.out.println(bs(n));
        }
    }
}
