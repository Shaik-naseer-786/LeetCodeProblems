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
    public int countPairs(TreeNode root, int distance) {
        if(root==null){
            return 0;
        }
        int[] count=new int[1];
        dfs(root,distance,count);
        return count[0]++;
    }
    private List<Integer> dfs(TreeNode node,int distance,int[] count){
        if(node==null){
            return new ArrayList<>();
        }
        if(node.left==null && node.right==null){
            List<Integer> leafDist=new ArrayList<>();
            leafDist.add(1);
            return leafDist;
        }
        List<Integer> left=dfs(node.left,distance,count);
        List<Integer> right=dfs(node.right,distance,count);

        for(int i:left){
            for(int j:right){
                if(i+j<=distance){
                    count[0]++;
                }
            }
        }

        List<Integer> temp=new ArrayList<>();
        for(int i:left){
            if(i+1<=distance){
                temp.add(i+1);
            }
        }
        for(int i:right){
            if(i+1<=distance){
                temp.add(i+1);
            }
        }
        return temp;
    }
}