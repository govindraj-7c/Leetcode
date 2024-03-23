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
    public void reorderList(ListNode head) {
        ListNode ans = head;
        ListNode curr = head.next;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = reverseList(middle.next);
        middle.next = null;
        while(secondHalf != null){
            ans.next = secondHalf;
            secondHalf = secondHalf.next;
            ans = ans.next;
            ans.next = curr;
            curr = curr.next;
            ans = ans.next;
        }
    }
    public ListNode findMiddle(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode hear = head;
        ListNode turtle = head;
        while(hear != null && hear.next != null){
            hear = hear.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        return prev;
    }
}