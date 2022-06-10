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
    
    private boolean flag= false;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        Helper(root, sum, targetSum);
        return flag;
    }
    
    public TreeNode Helper(TreeNode root, int sum, int targetSum) {
        if(root == null) return null;
        
        sum= sum + root.val;
        TreeNode left= Helper(root.left, sum, targetSum);
        TreeNode right= Helper(root.right, sum, targetSum);
        
        if(sum == targetSum && left == null && right == null) flag= true;        
        return root;
    }
}
