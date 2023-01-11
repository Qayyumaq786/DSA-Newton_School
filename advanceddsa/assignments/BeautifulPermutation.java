package advanceddsa.assignments;

import java.util.Scanner;

public class BeautifulPermutation {

    static int getPermutationCount(int n){

        boolean[] visited = new boolean[n+1];
        int[] count = new int[1];
        getPermutationCount(n, visited, count);
        return count[0];
    }

    static void getPermutationCount(int n,
                                    boolean[] visited,
                                    int[] count){
        if( n==0 ){
            count[0]++;
        }

        for(int i=1; i<visited.length;i++){

            if( !visited[i] && (i%n==0 || n%i==0)){
                visited[i] = true;
                getPermutationCount(n-1, visited, count);
                visited[i] = false;
            }
        }
    }

    /**
     * n=3
     *      2 1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getPermutationCount(n));
    }
}
