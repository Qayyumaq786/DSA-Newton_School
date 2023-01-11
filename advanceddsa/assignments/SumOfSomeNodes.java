package advanceddsa.assignments;

import java.io.*;
import java.util.*;

public class SumOfSomeNodes implements Runnable {

    static int getChildCount(HashMap<Integer, HashSet<Integer>> graph, int node){
        // return set.size for root node and for other set.size()-1
        return node==1
                ? graph.get(node).size()
                : graph.get(node).size()-1;
    }

    static void dfs(HashMap<Integer, HashSet<Integer>> graph,
                    HashMap<Integer, Integer> sumOfAncestors,
                    int curAncestorSum,
                    int k,
                    int parent,
                    int root
                    ){
        int childCount = getChildCount(graph, root);
        if(childCount >= k){
            curAncestorSum += root;
        }

        sumOfAncestors.put(root, curAncestorSum);
        // call dfs for children
        for(int v: graph.get(root)){
            if(v != parent){
                dfs(graph,
                        sumOfAncestors,
                        curAncestorSum,
                        k,
                        root, v);
            }
        }


    }

    public static void main(String[] args) {
        new Thread(null, new SumOfSomeNodes(), "whatever", 1<<26).start();
    }

    public void run() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        // initialize graph for all nodes
        for(int i=1; i<=n;i++){
            graph.put(i, new HashSet<>());
        }

        // adding nodes
        for(int i=0; i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        HashMap<Integer, Integer> sumOfAncestors = new HashMap<>();
        for(int i=1; i<=n;i++){
            sumOfAncestors.put(i, 0);
        }

        dfs(graph, sumOfAncestors,0,k,-1,1);

        for (int i=1; i<=n;i++){
            System.out.println(sumOfAncestors.get(i));
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}


// Solution for assignment: as java code doesn't seem to work
/**
 * #include<bits/stdc++.h>
 * using namespace std;
 *
 * #define pu push_back
 * #define fi first
 * #define se second
 * #define mp make_pair
 * #define int long long
 * #define pii pair<int,int>
 * #define mm (s+e)/2
 * #define all(x) x.begin(), x.end()
 * #define For(i, st, en) for(int i=st; i<en; i++)
 * #define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
 * #define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
 * #define sz 2000000
 * vector<int> NEB[sz];
 * int val[sz],su[sz];
 * int k;
 * void dfs(int s,int f,int sum)
 * {
 *        int cnt=NEB[s].size();
 *
 *        if(s!=1) cnt--;
 *        if(cnt>=k) sum+=s;
 * 	for(auto it:NEB[s])
 *        {
 * 		if(it!=f)
 *        {
 * 			  dfs(it,s,sum);
 *        }
 *    }
 * 	su[s]=sum;
 *
 * }
 * signed main()
 * {
 *
 *
 * 		int n;
 * 		cin>>n>>k;
 * 		for(int i=0;i<n-1;i++)
 *        {
 * 			int a,b;
 * 			cin>>a>>b;
 * 			NEB[a].pu(b);
 * 			NEB[b].pu(a);
 *
 *        }
 * 		//cout<<"hh";
 * 		dfs(1,0,0);
 *
 * 		for(int i=1;i<=n;i++)
 *        {
 * 			cout<<su[i]<<" "<<endl;
 *        }
 *
 *
 * }
 */