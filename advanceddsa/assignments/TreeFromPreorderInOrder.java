package advanceddsa.assignments;

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class TreeFromPreorderInOrder {

    static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static TreeNode buildTree(int[] in, int[] post,
                                      int inStart, int inEnd,
                                      int[] postIndex){

        if(inStart > inEnd)
            return null;

        if(postIndex[0] == -1){
            return null;
        }
        int el = post[postIndex[0]];
        postIndex[0]--;


        TreeNode root = new TreeNode(el);
        //System.out.println(root.val);

        if(inStart==inEnd){
            return root;
        }

        int searchIndex = searchElement(in, inStart, inEnd, el);
        //System.out.println("serchIndex"+searchIndex);
        root.right = buildTree(in, post,
                searchIndex+1, inEnd,postIndex);

        root.left = buildTree(in, post,
                inStart, searchIndex-1,postIndex);

        return root;
    }

    static int searchElement(int[] arr , int start, int end, int el){
        for(int i=start; i<=end; i++){
            if(arr[i] == el)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        int[] post = new int[n];

        for(int i=0; i<n;i++){
            in[i]= sc.nextInt();
        }

        for(int i=0; i<n;i++){
            post[i] = sc.nextInt();
        }

        TreeNode root = buildTree(in, post, 0, in.length-1, new int[]{in.length-1});
        preOrder(root);
    }

    static class TreeNode{
        int val;
        TreeNode left, right;

        public TreeNode(int val){
            this.val = val;
            left = right = null;
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
