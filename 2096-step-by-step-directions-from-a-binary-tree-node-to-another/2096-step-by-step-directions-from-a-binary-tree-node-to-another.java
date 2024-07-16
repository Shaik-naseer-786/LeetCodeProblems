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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca=findLca(root,startValue,destValue);
        System.out.println(lca.val);
        StringBuilder pathStart=new StringBuilder();
        findPath(lca,startValue,pathStart);
        StringBuilder pathDest=new StringBuilder();
        findPath(lca,destValue,pathDest);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<pathStart.length();i++){
            result.append('U');
        }
        result.append(pathDest.reverse().toString());
        return result.toString();
    }
    public TreeNode findLca(TreeNode root,int startValue,int destValue){
        if(root==null){
            return null;
        }
        if(root.val==startValue|| root.val==destValue){
            return root;
        }
        TreeNode left=findLca(root.left,startValue,destValue);
        TreeNode right=findLca(root.right,startValue,destValue);

        if(left!=null && right!=null){
            return root;
        }
        return (left!=null)?left:right;
    }
    public boolean findPath(TreeNode root,int value,StringBuilder path){
        if(root==null){
            return false;
        }
        if(root.val==value){
            return true;
        }
        if(findPath(root.left,value,path)){
            path.append('L');
            return true;
        }
        if(findPath(root.right,value,path)){
            path.append('R');
            return true;
        }
        return false;
    }

}