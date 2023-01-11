import java.util.Scanner;

public class st {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z= Math.abs(-32);
        System.out.println(z);
        int n= sc.nextInt();
        int x= sc.nextInt();
        int a[]=new int[x];
        for (int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(minCoinn(n,a));


    }
    public static int minCoinn(int n,int a[]){
        if (n==0)return 0;
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if(n-a[i]>=0){
                int sunAns=minCoinn(n-a[i],a);
                if(sunAns!=Integer.MAX_VALUE && sunAns+1<ans){
                    ans=sunAns+1;
                }
            }
        }

        return ans;
    }
}
