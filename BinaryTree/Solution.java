package BinaryTree;

import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left =  new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root!=null){
            q.offer(root);
        }
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size;i++){
                TreeNode node = q.poll();

                if( i == size - 1){
                    level.add(node.data);
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }

            result.add(level);
        }

    }
}
