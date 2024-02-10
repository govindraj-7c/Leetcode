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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode firstHalfEnd = isMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prevNode = head;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }
    public ListNode isMiddle(ListNode head){
        ListNode hear = head;
        ListNode turtle = head;
        while(hear.next != null && hear.next.next != null){
            hear = hear.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
}