package advanceddsa.assignments;

public class Diameter {
    public static int getDiameter(Node root)
    {
        if(root==null){
            return 0;
        }

        int d = 1 + height(root.left) + height(root.right);
        int lD = getDiameter(root.left);
        int rD = getDiameter(root.right);

        return Math.max(d, Math.max(lD,rD));
    }

    private static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1+ Math.max(left, right);
    }

    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
