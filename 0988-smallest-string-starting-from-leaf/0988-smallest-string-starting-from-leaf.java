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
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return ""; // Base case for empty tree
        
        return findSmallest(root, new StringBuilder()).toString();
    }
    
    private StringBuilder findSmallest(TreeNode node, StringBuilder current) {
        if (node == null) return null; // Base case for null node
        
        current.append((char)('a' + node.val)); // Append current node's value as a character
        
        if (node.left == null && node.right == null) {
            // If leaf node, return the string representation
            return current.reverse();
        }
        
        StringBuilder leftResult = findSmallest(node.left, new StringBuilder(current));
        StringBuilder rightResult = findSmallest(node.right, new StringBuilder(current));
        
        if (leftResult == null) return rightResult; // If left subtree is null, return right subtree
        if (rightResult == null) return leftResult; // If right subtree is null, return left subtree
        
        // Compare the strings from left and right subtrees and return the smaller one
        return leftResult.toString().compareTo(rightResult.toString()) <= 0 ? leftResult : rightResult;
    }
}
