package advanceddsa.trees;

// Count the number of leaves in a binary tree
public class CountLeaves {

    int countLeafNodes(TreeNode root){
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

}
