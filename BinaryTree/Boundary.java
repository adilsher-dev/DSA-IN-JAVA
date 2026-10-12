package BinaryTree;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

   public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Boundary {
    static void printLeftBoundary(Node root){
        if(root == null){
            return;
        }
        Node curr = root.left;
        while(curr != null){
            if(!(curr.left == null && curr.right == null)){
                System.out.println(curr.data);
            }
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }
    static void printRightBoundary(Node root){
        if(root == null){
            return;
        }
        Stack<Integer> s = new Stack<>();
        Node curr = root.right;
        while(curr != null){
            if(!(curr.left == null && curr.right == null)){
                s.push(curr.data);
            }
            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    static void printLeaves(Node root){
        if(root == null){
            return;
        }
        printLeaves(root.left);
        if(root.left == null && root.right == null){
            System.out.println(root.data);
        }
        printLeaves(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        System.out.println("Boundary Traversal:");
        printLeftBoundary(root);
        printLeaves(root);
        printRightBoundary(root);
    }
}
