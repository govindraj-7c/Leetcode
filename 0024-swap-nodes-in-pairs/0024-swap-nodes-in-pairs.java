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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;

        while(curr != null && curr.next != null){
            ListNode node1 = curr;
            ListNode node2 = curr.next;
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;

            curr = node2.next;
        }

        return head;
    }
}