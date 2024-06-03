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
    public ListNode sortList(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        int[] arr = new int[size];
        int pointer = 0;
        curr = head;
        while(curr != null){
            arr[pointer] = curr.val;
            pointer++;
            curr = curr.next;
        }
        Arrays.sort(arr);
        curr = head;

        for(int i=0; i<size; i++){
            curr.val = arr[i];
            curr = curr.next;
        }

        return head;

    }
}