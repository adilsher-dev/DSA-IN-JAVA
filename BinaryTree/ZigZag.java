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
public class ZigZag{
    static List<List<Integer>> levelOrder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();

        if(root == null){
            return ans;
        }

        q.offer(root);

        boolean index = false;

        while(!q.isEmpty()){
            int level = q.size();

            List<Integer> sublist = new LinkedList<Integer>();

            for(int i = 0; i < level;i++){
                Node curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                sublist.add(curr.data);
            }
            if(!index){
            ans.add(sublist);
            index = true;
            }
            else{
                Collections.reverse(sublist);
                ans.add(sublist);
                index = false;
            }
        }
        return ans;
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("The ans list is:");
        System.out.println(levelOrder(root));

    }
}