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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int size = 0;
        ListNode sizeNode = head;
        while(sizeNode != null){
            size++;
            sizeNode = sizeNode.next;
        }
        if(k>size){
            for(int i=0; i<k%size; i++){
                ListNode pointer1 = head;
                ListNode pointer2 = head.next;

                while(pointer2.next != null){
                    pointer2 = pointer2.next;
                    pointer1 = pointer1.next;
                }

                pointer1.next = null;
                pointer2.next = head;
                head = pointer2;
            }
        }
        else if(k<size){
            for(int i=0; i<k; i++){
                ListNode pointer1 = head;
                ListNode pointer2 = head.next;

                while(pointer2.next != null){
                    pointer2 = pointer2.next;
                    pointer1 = pointer1.next;
                }

                pointer1.next = null;
                pointer2.next = head;
                head = pointer2;
            }
        }
        else{
            return head;
        }
        

        return head;
    }
}