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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTreeHelper(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1, indexMap);
    }

    private TreeNode buildTreeHelper(int[] postorder, int postStart,int postEnd,  int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> indexMap) {
        if (postStart>postEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postEnd]);

        int inRootIndex = indexMap.get(root.val);

        int numsleft = inRootIndex - inStart;
        root.left = buildTreeHelper(postorder, postStart, postStart+numsleft-1, inorder, inStart,
                inRootIndex-1, indexMap);
        root.right = buildTreeHelper(postorder, postStart+numsleft, postEnd-1, inorder,inRootIndex+1,inEnd, indexMap);

        return root;
    }

}