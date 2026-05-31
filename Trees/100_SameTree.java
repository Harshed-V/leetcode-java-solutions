import java.util.*;
import java.util.LinkedList;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;      //check for both tree or node for null
        if(p == null || q == null) return false;     //check for unequal nodes 
        if(p.val!= q.val) return false;              //check for values of each node
        return isSameTree(p.Left, q.Left) && isSameTree(p.Right, q.Right);      //Recursively calls the code to traverse all along the tree
    }
}


//Main class
public class SameTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String P = sc.nextLine();
        String[] nodeValuesP = P.trim().split("\\s+");
        String Q = sc.nextLine();
        String[] nodeValuesQ = Q.trim().split("\\s+");

        BinarySameTree treep = new BinarySameTree();
        TreeNode nodeP = treep.treeBuilt(nodeValuesP);

        BinarySameTree treeq = new BinarySameTree();
        TreeNode nodeQ = treeq.treeBuilt(nodeValuesP);

        Solution sol = new SolutionS();
        boolean out = sol.isSameTree(nodeP,nodeQ);
        System.out.println(out);
    }
}
class BinarySameTree{
    TreeNode Root;
    public TreeNode treeBuilt(String[] nodeValues) {
        if (nodeValues.length == 0 || nodeValues[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(nodeValues[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;

        while(i<nodeValues.length){
            TreeNode current = q.poll();
            if (i < nodeValues.length && !nodeValues[i].equals("null")) {
                current.Left = new TreeNode(Integer.parseInt(nodeValues[i]));
                q.offer(current.Left);
            }
            i++;
            if (i < nodeValues.length && !nodeValues[i].equals("null")) {
                current.Right = new TreeNode(Integer.parseInt(nodeValues[i]));
                q.offer(current.Right);
            }
            i++;

        }return root;
    }
}

class TreeNode{
    int val;
    TreeNode Left,Right;
    public TreeNode(int val){
        this.val = val;
        Left = Right = null;
    }
}
