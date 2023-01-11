package advanceddsa.assignments;

import java.util.HashMap;
import java.util.Scanner;

// https://my.newtonschool.co/playground/code/6ncerliaijq3/
public class CountLeavesInBinaryTree {

    static int countLeafNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        else if(root.left == null
                && root.right==null){
            return 1;
        }
        else{
            return countLeafNodes(root.left)
                    + countLeafNodes(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, TreeNode>  hm = new HashMap<>();
        for(int i=1; i<=n;i++){
            hm.put(i, new TreeNode(i));
        }

        for(int i=1; i<=n;i++){
            TreeNode node = hm.get(i);
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(l!=-1){
                node.left = hm.get(l);
            }

            if(r!=-1){
                node.right = hm.get(r);
            }

        }

        System.out.println(countLeafNodes(hm.get(1)));
    }
}

