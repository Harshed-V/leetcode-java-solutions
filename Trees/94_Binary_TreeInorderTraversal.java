import java.util.*;
import java.util.LinkedList;
//Start of LeetCode Problem
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> Result = new ArrayList<>();     //For output a new Array List has been Created
        InOrder(root, Result);                        //for InOrder Traversal
        return Result;
    }public void InOrder(TreeNode node, List<Integer> Result){
        if(node == null) return;
        InOrder(node.left, Result);     //finds leftmost node using recursion
        Result.add(node.val);           //Stores in Result ArrayList
        InOrder(node.right, Result);    //finds rightmost node using recursion
    }
}
//End
//Main class Below
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] nodeValues = inputLine.trim().split("\\s+");

        Btree tree = new Btree();
        TreeNode root = tree.treeBuilt(nodeValues);

        Solution sol = new Solution();
        List<Integer> inorder = sol.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + inorder);
    }
}

 class Btree{
    TreeNode root;
    public TreeNode treeBuilt(String[] nodeValues) {
        if (nodeValues.length == 0 || nodeValues[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(nodeValues[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;

        while(i<nodeValues.length){
            TreeNode current = q.poll();
            if (i < nodeValues.length && !nodeValues[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodeValues[i]));
                q.offer(current.left);
            }
            i++;
            if (i < nodeValues.length && !nodeValues[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodeValues[i]));
                q.offer(current.right);
            }
            i++;

        }return root;
    }
}
class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
