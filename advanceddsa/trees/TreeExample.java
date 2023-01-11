package advanceddsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeExample {

    /**
     * This function builds the tree referred in the notes.
     */
    static TreeNode buildTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        return root;
    }

    // NLR
    static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // LRN
    static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    // LNR
    static void inOrder(TreeNode root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }

        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode n = q.poll();

            System.out.print(n.data+" ");

            if(n.left!=null){
                q.offer(n.left);
            }

            if(n.right!=null){
                q.offer(n.right);
            }
        }

    }

    static int height(TreeNode root){
        return root==null?0: 1 + Math.max(
                height(root.left),
                height(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
    }
}
