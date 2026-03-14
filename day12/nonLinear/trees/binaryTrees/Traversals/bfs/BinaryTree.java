package DSA.nonLinear.trees.binaryTrees.Traversals.bfs;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
    }
    public class BinaryTree {
        public static void levelOrderTraversalOrBFS(TreeNode root){
            //Base case //cornerr case //edge case
            if(root==null){
                return;
            }
            //You are pushing nodes into the queue,not integers
            Queue<TreeNode> queue=new LinkedList<>();
            //Add the root node into the queue & then traverse left & right
            queue.add(root);
            //print all nodes level by level till the queue is empty
            while(!queue.isEmpty()){
                TreeNode temp=queue.poll();//remove and store the front node
                System.out.print(temp.data + " ");
                //left subtree
                if(temp.left!=null) {
                    queue.add(temp.left);
                }
                //Right subtree
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            System.out.println();
        }

        public static void main(String[] args) {
            //L0
            TreeNode root = new TreeNode(1);
            //level 1
            root.left=new TreeNode(2);
            root.right=new TreeNode(3);
            //level 2
            root.left.left=new TreeNode(4);
            root.left.right=new TreeNode(5);
            root.right.left=new TreeNode(6);
            root.right.right=new TreeNode(7);
            System.out.println("BFS or level order traversal: ");
            levelOrderTraversalOrBFS(root);
        }
    }




