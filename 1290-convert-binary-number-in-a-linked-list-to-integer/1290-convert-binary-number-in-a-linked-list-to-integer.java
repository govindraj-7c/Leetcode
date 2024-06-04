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
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode curr = head;
        int ans = 0;

        while(curr != null){
            size++;
            curr = curr.next;
        }

        curr = head;
        while(size-- > 0){
            ans += curr.val*power(2,size);
            curr = curr.next;
        }

        return ans;
    }
    private int power(int no, int pow){
        int ans = 1;
        if(pow == 0) return 1;
        while(pow-- > 0){
            ans *= no;
        }
        return ans;
    }
}