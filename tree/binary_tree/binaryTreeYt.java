package tree.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeYt {
    static   class Node{
        int data;
        Node left;
        Node rigth;
        Node(int v){
            data=v;
            left=null;
            rigth=null;
        }
    }
    static class BinaryTree{
        static int indx=-1;
        public static Node BuildeTree(int node[]){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node NewNode=new Node(node[indx]);
            NewNode.left=BuildeTree(node);
            NewNode.rigth=BuildeTree(node);
            return NewNode;


        }

    }

    public static void LevelOrder(Node root){
        if (root==null){
            return;
        }
        Queue<Node>q1=new LinkedList<>();
        q1.add(root);
        q1.add(null);
        while (!q1.isEmpty()){
            Node curr= q1.remove();
            if(curr==null){
                System.out.println();
                if(q1.isEmpty()){
                    break;
                }
                else {
                    q1.add(null);
                }
            }
            else {
                System.out.print(curr.data+" ");
                if (curr.left!=null){
                    q1.add(curr.left);

                }
                if(curr.rigth!=null){
                    q1.add(curr.rigth);
                }

            }
        }
    }
    public static int hieght(Node root){
        if (root==null){
            return 0;
        }
        int left=hieght(root.left);
        int right=hieght(root.rigth);
        return Math.max(left,right)+1;

    }
    public static int Countn(Node root){
        if (root==null){
            return 0;
        }
       int left=Countn(root.left);
        int right=Countn(root.rigth);
        return left+right+1;

    }
    public static int sumOdNodes(Node root){
        if (root==null){
            return 0;
        }
        int left=sumOdNodes(root.left);
        int right=sumOdNodes(root.rigth);
        return right+left+root.data;

    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildeTree(nodes);
        //System.out.println(root.data);
        //LevelOrder(root);
        //System.out.println(hieght(root));
       // System.out.println(Countn(root));
        //System.out.println(sumOdNodes(root));
        int i=010;
        int j=07;
        System.out.println(i);
        System.out.println(j);
    }
}
