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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }
    
    public boolean symmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null && r != null) return false;
        if (l != null && r == null) return false;
        
        if (l.val == r.val) {
            boolean check1 = symmetric(l.left, r.right);
            boolean check2 = symmetric(l.right, r.left);
            return check1 && check2;
        }
        else return false;
    }
}
