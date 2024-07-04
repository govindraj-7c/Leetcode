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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode curr = head.next;
        ListNode p = ans;
        int sum = 0;

        while(curr != null){
            if(curr.val == 0){
                p.next = new ListNode(sum);
                p = p.next;
                sum = 0;
            }
            sum += curr.val;
            curr = curr.next;
        }

        return ans.next;
    }
}