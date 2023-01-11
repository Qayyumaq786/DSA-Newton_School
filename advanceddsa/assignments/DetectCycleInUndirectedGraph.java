package advanceddsa.assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DetectCycleInUndirectedGraph {

    static boolean isCycle(HashMap<Integer, HashSet<Integer>> graph
            , int n){
        int[] states = new int[n];
        /**
         * 0 -> unvisited
         * 1-> in progress
         * 2-> finished
         */

        for(int u: graph.keySet()){
            if(states[u] == 0
                    && dfs(graph, states, u, -1)){
                return true;
            }
        }

        return false;
    }

    static boolean dfs(HashMap<Integer, HashSet<Integer>> graph,
                       int[] states,
                       int u, int parent){


        states[u] = 1; // mark the node in progress

        boolean ans = false;
        // go to all the children
        for(int v: graph.get(u)){
            if(states[v] == 1 && v!=parent){
                return true;
            }
            if(states[v] == 0){
                ans = ans || dfs(graph, states, v, u);
            }
        }

        states[u] = 2;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Let's initialize adjaceny list
        HashMap<Integer, HashSet<Integer>> graph =
                new HashMap<>();
        for(int i=0; i<n ; i++){
            graph.put(i, new HashSet<>());
            /*
            n = 4
            0-> {}
            1-> {}
            2-> {}
            3-> {}

            if we add 0 1
            0-> {1}
            1-> {0}
            ... rest all empty
             */

        }

        // let's add edges
        for(int i=0; i<m;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }

        if(isCycle(graph, n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
