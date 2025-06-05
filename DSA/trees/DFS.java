package trees;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import javax.swing.tree.TreeNode;

import Recursion.revnum;

public class DFS {
    int diameter = 0;
    public int diameterofBinaryTree(TreeNode root){
        height(root);
        return diameter;
    }
    int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftheight = height(node.left);
        int rightheight = height(node.right);
        int dia = leftheight - rightheight +1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftheight,rightheight)+1;
    }

    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right= left;
        return root;
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = Math.max(left,right)+1;

        return depth;
    }
    public void flatten(TreeNode root) {
       
        TreeNode current = root;
        while(root != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current .right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public boolean helper(TreeNode node,Integer low, Integer high){
          if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }
        if(high != null && node.val >= high){
            return false;
        }
        boolean leftTree = helper(node.left, low, node.val);
        boolean RightTree = helper(node.right,node.val, high);

        return leftTree && RightTree;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        return left == null ? right : left;
    }
     
    int count = 0;
    public int kthSmalllest(TreeNode root, int k){
        return helper(root,k).val;
    }
    public TreeNode helper(TreeNode root,int k){
        if(root == null){
            return null;
        }

        TreeNode left = helper(root.left, k);

        if(left != null){
            return left;
        }
        count ++;
        if(count == k){
            return root;
        }

        return helper(root.right, k);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return  null;
        }
        int r = preorder[0];
        int index = 0;

        for(int i =0; i<inorder.length; i++){
            if(inorder[i] == r){
                index =i;
            }
        }

        TreeNode node = new TreeNode[r];

        node.left = buildTree(Arrays.copyOfRange(preorder, 1 ,index+1), Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
        
        return node;

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        sum = sum * 10 + node.val;

        if(node.left == null && node.right == null){
            return sum;
        }

        return helper(node.left, sum) + helper(node.right, sum);
    }
    
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         helper(root);
         return ans;
    }
    int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        left = helper(node.left);
        right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left+right+node.val;

        ans = Math.max(ans,pathSum);

        return Math.max(left,right)+node.val;
    }

    boolean findPath(Node node,int [] arr){
        if(node== null){
            return arr.length == 0;
        }
        return helper(node,arr,0);
    }
    boolean helper(Node node,int[] arr, int index){
        if(node == null){
            return false;
        }
        if(index == arr.length || node.val != arr(index)){
            return false;
        }
        if(node.left == null && node.right == null && index = arr.length-1){
            return true;
        }

        return helper(node.left, arr, index+1) || helper(node.right, arr, index+1);
    }
    int countPaths(Node node,int Sum){
        List<Integer> path = new LinkedList<>();
        return helper(node,Sum,path);
    }
    int helper(Node node,int sum, List<Integer> path){
        if(node == null){
            return 0;
        }
        path.add(node.val);
        int count = 0;
        int s = 0;

        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()){
            s == itr.previous();

            if(s==sum){
                count++;
            }
        }

        count += helper(node.left, s, path) + helper(node.right,s,path);
        path.remove(path.size()-1);
        return count;

    }
}
