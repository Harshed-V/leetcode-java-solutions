```java
import java.util.*;

// Start of LeetCode Problem
class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    public void postOrder(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        postOrder(node.left, result);   // Traverse left subtree
        postOrder(node.right, result);  // Traverse right subtree
        result.add(node.val);           // Visit root node
    }
}

// Main Class
public class BinaryTreePostorderTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] nodeValues = inputLine.trim().split("\\s+");

        Btree tree = new Btree();
        TreeNode root = tree.treeBuilt(nodeValues);

        Solution sol = new Solution();

        List<Integer> postorder = sol.postorderTraversal(root);

        System.out.println("Postorder Traversal: " + postorder);
    }
}

// Binary Tree Builder
class Btree {

    TreeNode root;

    public TreeNode treeBuilt(String[] nodeValues) {

        if (nodeValues.length == 0 || nodeValues[0].equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(nodeValues[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (i < nodeValues.length) {

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
        }

        return root;
    }
}

// Tree Node Definition
class TreeNode {

    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
```
