package advanceDsa;

public class tree {
    static treeNode buildtree(){
        treeNode root=new treeNode(1);
        root.left=new treeNode(2);
        root.left.left=new treeNode(4);
        root.right=new treeNode(3);
        root.right.left=new treeNode(5);
        root.right.right=new treeNode(6);
        root.right.right.right=new treeNode(7);
        return root;
    }
    static void preOrder(treeNode root){ ///NLR
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    static void inOrder(treeNode root){ ///LNR
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);



    }
    static void POSTOrder(treeNode root){ ///LNR
        if(root==null){
            return;
        }

        POSTOrder(root.left);
        POSTOrder(root.right);
        System.out.print(root.data);


    }
    public static void main(String[] args) {
        treeNode root=buildtree();

        POSTOrder(root);


    }
}
class treeNode{
    int data;
    treeNode left;
    treeNode right;
    public  treeNode(int data){
        this.data=data;
        left=right=null;
    }
}
