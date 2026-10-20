
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MaximumDepth {

    static int Height(Node root){

        if(root == null){
            return 0;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);

        return 1 + Math.max(lh,rh);
    }
    
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.right = new Node(6);

        System.out.println("MaxiMum Depth:"+Height(root));
    }
}
