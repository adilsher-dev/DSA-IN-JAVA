
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
public class BalancedBT{

    static int BalancedBST(Node root){

        if(root == null){
            return 0;
        }

        int lh = BalancedBST(root.left);

        if(lh == - 1){
            return -1;
        }
        int rh = BalancedBST(root.right);

        if(rh == -1){
            return -1;
        }

        if(Math.abs(lh - rh) > 1){
            return -1;
        }

        return 1 + Math.max(lh,rh); //If BT is balanced so it returns height otherwise -1 ;//height(left) - height(right) <= 1

    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.right = new Node(6);

        System.out.println("MaxiMum Depth:"+BalancedBST(root));

    }
}