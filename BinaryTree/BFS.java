package BinaryTree;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(){

    }
    Node(int data){
        this.data = data;
    }
    Node(int data,Node left,Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BFS {
    static List<List<Integer>> levelOrder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();

        if(root == null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i = 0 ;i<level;i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().data);
            }
            ans.add(sublist);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("The ans list is:");
        System.out.println(levelOrder(root));
    }
}
