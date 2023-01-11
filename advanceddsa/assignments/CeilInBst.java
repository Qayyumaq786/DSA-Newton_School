package advanceddsa.assignments;

import java.util.Scanner;

public class CeilInBst {
    private static TreeNode constructTree(int[] a,int i,int j)
    {
        if(i>j)
            return null;
        int middle=(i+j)/2;
        TreeNode l1=new TreeNode(a[middle]);
        l1.left=constructTree(a,i,middle-1);
        l1.right=constructTree(a,middle+1,j);
        return l1;
    }

    static int ceil(TreeNode root, int el){
        if(root==null){
            return -1;
        }

        if(root.val == el){
            return root.val;
        }

        // if root is less than element: move right
        if(root.val < el){
            return ceil(root.right, el);
        }

        int val = ceil(root.left, el); // -1

        if(val >= el)
            return val;
        else
            return root.val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int el = sc.nextInt();

        TreeNode root = constructTree(arr,0, arr.length-1);

        System.out.println(ceil(root, el));
    }


    static  class TreeNode{
        int val;
        TreeNode left, right;

        public TreeNode(int val){
            this.val = val;
            left = right = null;
        }
    }
}
