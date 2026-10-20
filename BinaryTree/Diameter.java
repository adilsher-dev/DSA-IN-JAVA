class Node{
    int data;
    Node left;
    Node  right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
//int maxi: Java passes a copy of its value to the function. Changing it doesn't change the original variable.



//int[] maxi: Java passes a copy of the array reference. Both references point to the same array, so changing maxi[0] updates the shared value.
//
//
public class Diameter {

    static int ans(Node root){
        int [] maxi = new int[1];//agar variable use krte to uski copy update hoti ans me 0 hi milta lekin arr me original value update hogi dono jgh
        Diameter(root,maxi);
        return maxi[0];
    }

    static int Diameter(Node root,int [] maxi){

        if(root == null){
            return 0;
        }

        int lh = Diameter(root.left,maxi);
        int rh = Diameter(root.right,maxi);

        maxi[0] = Math.max(maxi[0],lh+rh);

        return 1 + Math.max(lh,rh);
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


        System.out.println("MaxiMum Depth:"+ans(root));

    }
}
