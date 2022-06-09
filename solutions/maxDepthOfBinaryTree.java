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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int max_l = 1, max_r = 1;
        int height_l = checkDepth(root.left, max_l);
        int height_r = checkDepth(root.right, max_r);
        
        return height_l > height_r ? height_l : height_r; 
    }
    
    public int checkDepth(TreeNode root, int max) {
        if (root==null) return max;
        
        else {
            ++max;
            int left = checkDepth(root.left, max);
            int right = checkDepth(root.right, max);
            return left > right ? left : right;
        }
    }
}
