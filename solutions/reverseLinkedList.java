/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return putPreAfterNode(head, null);
    }
    private ListNode putPreAfterNode(ListNode node, ListNode pre) {
        if (node == null) {
            return pre;
        }
        ListNode next = node.next;
        node.next = pre;
        return putPreAfterNode(next, node);
    }
}
