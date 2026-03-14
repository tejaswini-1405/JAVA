package DSA.nonLinear.trees.binaryTrees.Traversals.dfs;

public class TreeNode {
    int data;//the data of the node
    TreeNode left;//the reference to the left child'
    TreeNode right;// the refrence to the right child
    TreeNode(int data){
        this.data=data;
        this.right=this.left=null;//Initializing th enode has no children
    }
    public static void preOrder(TreeNode root){//DLR
        if(root!=null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }
    public static void inOrder(TreeNode root){//LDR
        if(root!=null){

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }
    public static void postOrder(TreeNode root){//LRD
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

    }

    public static void main(String[] args) {
        //Rule for constructing the binary tree => Top to bottom left to right
        //level 0
        TreeNode root=new TreeNode(1);
        //level 1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        //level 2
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        //level 3
        root.left.right.left=new TreeNode(9);
        root.right.right.left=new TreeNode(15);
        System.out.println("Preorder traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("inorder traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        postOrder(root);
        System.out.println();


    }
}
