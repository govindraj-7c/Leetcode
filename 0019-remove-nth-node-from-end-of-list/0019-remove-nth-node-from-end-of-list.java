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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        if(len-n == 0 || head.next == null){
            return head.next;
        }
        ListNode prev = head;
        curr = head.next.next;
        for(int i=1; i<len-n; i++){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = curr;
        return head;
    }
}