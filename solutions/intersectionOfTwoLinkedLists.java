/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a_pointer = headA, b_pointer = headB;
        while (a_pointer != b_pointer) {
            a_pointer = a_pointer == null ? headB : a_pointer.next;
            b_pointer = b_pointer == null ? headA : b_pointer.next;
        }
        return a_pointer;
    }
}
