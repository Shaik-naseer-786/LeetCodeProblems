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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans=inorder(root);
        
        return ans.get(k-1);
    }
     public List<Integer> inorder(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    public void helper(TreeNode root,List<Integer> result){
        if(root!=null){
            helper(root.left,result);
            result.add(root.val);
            helper(root.right,result);
        }
    }
}