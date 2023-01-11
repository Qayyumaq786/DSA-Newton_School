package advanceddsa.assignments;

public class DistanceBetweenLeftMostRightMostNode {
    public int distanceBetweenLeftmostAndRightMost(TreeNode root){
        if(root==null){
            return 0;
        }
        int[] minmax = new int[2];
        findDistUtil(root, 0, minmax);
        return minmax[1] - minmax[0];
    }

    private void findDistUtil(TreeNode root, int axis ,int[] minmax){
        if(root == null){
            return;
        }
        minmax[0] = Math.min(minmax[0], axis);
        minmax[1] = Math.max(minmax[1], axis);

        findDistUtil(root.left, axis-1, minmax);
        findDistUtil(root.right, axis+1, minmax);

    }
}
