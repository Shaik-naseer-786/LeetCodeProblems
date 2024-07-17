/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Set<Integer> toDeleteSet = new HashSet<>();
        for (int val : to_delete) {
            toDeleteSet.add(val);
        }
        
        // Start with the root of the tree.
        if (!toDeleteSet.contains(root.val)) {
            result.add(root);
        }
        
        // Call the helper function to process the tree.
        delNodesHelper(root, toDeleteSet, result);
        
        return result;
    }
    
    private TreeNode delNodesHelper(TreeNode node, Set<Integer> toDeleteSet, List<TreeNode> result) {
        if (node == null) {
            return null;
        }
        
        // Recurse on the left and right children.
        node.left = delNodesHelper(node.left, toDeleteSet, result);
        node.right = delNodesHelper(node.right, toDeleteSet, result);
        
        // If the current node needs to be deleted, handle it.
        if (toDeleteSet.contains(node.val)) {
            if (node.left != null) {
                result.add(node.left);
            }
            if (node.right != null) {
                result.add(node.right);
            }
            return null; // Return null to the parent, indicating the node is deleted.
        }
        
        return node; // Return the current node if it's not deleted.
    }
}