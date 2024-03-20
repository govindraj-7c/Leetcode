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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode currLast1 = list1;
        while(a>1){
            curr1 = curr1.next;
            a--;
        }
        while((b+1)>0){
            currLast1 = currLast1.next;
            b--;
        }
        while(curr2.next != null){
            curr2 = curr2.next;
        }
        curr2.next = currLast1;
        curr1.next = list2;
        return list1;
    }
}