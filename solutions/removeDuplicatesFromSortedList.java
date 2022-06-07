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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode temp1 = head;
        ListNode temp2 = temp1.next;
        while (temp1.next != null) {
            while(temp1.val == temp2.val) {
                temp2 = temp2.next;
                if (temp2 == null) break;
            }
            if (temp2 == null) {
                temp1.next = temp2;
                break;
            }
            temp1.next = temp2;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head;
    }
}
