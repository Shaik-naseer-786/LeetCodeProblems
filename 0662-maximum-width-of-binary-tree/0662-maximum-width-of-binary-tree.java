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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> positionMap = new HashMap<>();
        queue.offer(root);
        positionMap.put(root, 1);
        int maxWidth = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            int leftmost = positionMap.get(queue.peek());
            int rightmost = leftmost;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int position = positionMap.get(node);
                rightmost = position;
                
                if (node.left != null) {
                    queue.offer(node.left);
                    positionMap.put(node.left, position * 2);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                    positionMap.put(node.right, position * 2 + 1);
                }
            }
            
            maxWidth = Math.max(maxWidth, rightmost - leftmost + 1);
        }
        
        return maxWidth;
    }
}
