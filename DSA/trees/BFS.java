package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;

import javax.swing.tree.TreeNode;

class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();


        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i =0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

    public TreeNode findSuccessor(TreeNode root, int key){
        

        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
              TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            
            if(currentNode.val == key){
                break;
            }

        return queue.peek();
    }
  }

  public Node Connect(Node root){
    if(root == null){
        return null;
    }
    Node leftMost = root;
    while(leftMost.left != null){
        Node current = leftMost;
        while(current != null){
            current.left.next = current.right;
            if(current.next != null){
                current.right.next = current.next.left;
            }
            current = current.next;
        }
        leftMost = leftMost.left;
    }
    return root;
  }

  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();


    if(root == null){
        return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>(levelSize);
        for(int i =0;i<levelSize;i++){
            TreeNode currentNode = queue.poll();

            if(i==levelSize-1){
               result.add(currentNode.val);
            }
            currentLevel.add(currentNode.val);
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }
    }

    return result;
  }

  public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);
           
       return {
        (level(root,xx,0)==level(root,yy,0)) && (isSiblings(root,xx,yy));
       }
   }
   TreeNode findNode(TreeNode node,int x){
    if(node == null){
        return null;
    }
    if(node.val == x){
        return node;
    }
    TreeNode n = findNode(node.left, x);
    if(n!= null){
        return n;
    }
    return findNode(node.right, x);
   }
   boolean isSiblings(TreeNode node,TreeNode x,TreeNode y){
    if(node == null){
        return false;
    }
    return {
        (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSiblings(node.left,x,y) || isSiblings(node.right, x, y);
    }
   }

   int level(TreeNode node, TreeNode x, int lev){
    if(node == null){
        return 0;
    }
    if(node == x){
        return lev;
    }
    int l = level(node.left, x, level);
    if(l !=0){
        return l;
    }
    return level(node.right,x,level);
   }

   public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root.left);
    queue.add(root.right);

    while(queue.isEmpty()){
        TreeNode left = queue.poll();
        TreeNode right = queue.poll();

        if(left == null && right == null){
            continue;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        queue.add(left.left);
        queue.add(right.right);
        queue.add(left.right);
        queue.add(right.left);
    }
    return true;
   }
}