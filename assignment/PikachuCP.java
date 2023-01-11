package assignment;

import java.util.Scanner;

public class PikachuCP {
    static int[] sieveOfEratosthenes(int N)
    {
        int arr[] = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                for (int j = i * 2; j <= N; j += i) {
                    arr[j] = arr[j] + 1;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        return arr;
    }

    static int countNumbersWithFPrimeFactors(int[] primes,int l, int h, int f){
        int count = 0;
        for(int i=l+1;i<=h;i++){

            if(primes[i]==f){
                count++;
            }
        }
        return count==0?-1:count;
    }

    public static void main(String[] args) {
        int[] primes = sieveOfEratosthenes(1000000);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int l = sc.nextInt();
            int r= sc.nextInt();
            int f = sc.nextInt();
            int ans = countNumbersWithFPrimeFactors(primes,l,r,f);
            System.out.println(ans);
        }
    }
}
