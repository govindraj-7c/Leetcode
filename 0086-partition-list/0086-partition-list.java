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
    public ListNode partition(ListNode head, int x) {
        ListNode smallList = new ListNode(0);
        ListNode largeList = new ListNode(0);
        ListNode smallPointer = smallList;
        ListNode largePointer = largeList;
        ListNode curr1 = head;

        while(curr1 != null){
            if(curr1.val < x){
                smallPointer.next = curr1;
                smallPointer = smallPointer.next;
            }
            else{
                largePointer.next = curr1;
                largePointer = largePointer.next;
            }
            curr1 = curr1.next;
        }

        smallPointer.next = largeList.next;
        largePointer.next = null;

        return smallList.next;
    }
}