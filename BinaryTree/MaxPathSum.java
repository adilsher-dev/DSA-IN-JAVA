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

public class MaxPathSum {

    static int MaxPath(Node root){

        int [] maxi = new int[1];
        maxSum(root,maxi);
        return maxi[0];
        
    }

    static int maxSum(Node root,int [] maxi){
        if(root == null){
            return 0;
        }

        int lh = Math.max(0,maxSum(root.left,maxi));
        int rh = Math.max(0,maxSum(root.right,maxi));

        maxi[0] = Math.max(maxi[0],root.data + lh + rh);

        return root.data + Math.max(lh,rh);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.left.left.left = new Node(9);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        root.right.right.right.right = new Node(8);

        System.out.println("MaxiMum Depth:"+MaxPath(root));
    }
}
