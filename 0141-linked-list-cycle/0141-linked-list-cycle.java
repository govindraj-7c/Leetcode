/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head;
        ListNode hear = head;
        while(hear != null && hear.next != null){
            turtle = turtle.next;
            hear = hear.next.next;
            if(hear == turtle){
                return true;
            }
        }
        return false;
    }
}