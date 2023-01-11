package advanceddsa.assignments;

import java.util.Scanner;

public class UniqueBST {
    // Equation we got in class for the answer
    // g(n) +=  g(i-1) * g(n- i ) for i =.1 to n

    static int uniqueBST(int N){
        int[] g = new int[N+1];
        g[0] = 1;
        g[1] = 1;

        for(int n=2; n<=N ; n++){
            for(int i=1; i<=n;i++){
                g[n] += g[i-1]* g[n-i];
            }
        }
        return g[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(uniqueBST(n));
    }
}
