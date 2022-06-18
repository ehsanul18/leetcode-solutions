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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output_arr = new ArrayList<>();
        
        if (root == null) return output_arr;
        
        stack.push(root);
        
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = stack.pop();
                output_arr.add(curNode.val);
                if (curNode.right != null) {
                    stack.push(curNode.right);
                }
                if (curNode.left != null) {
                    stack.push(curNode.left);
                }
            }
        }
        
        return output_arr;
    }
}
