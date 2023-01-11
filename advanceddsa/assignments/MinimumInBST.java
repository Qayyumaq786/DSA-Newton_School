package advanceddsa.assignments;

public class MinimumInBST {
    static int minValue(Node node)
    {
        // Your code here
        if(node==null){
            return -1;
        }
        else if(node.left!=null){
            return minValue(node.left);
        }
        else{
            return node.data;
        }
    }
}
