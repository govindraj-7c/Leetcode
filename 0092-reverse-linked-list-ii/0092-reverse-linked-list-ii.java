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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        ListNode node1 = head;
        ListNode node2 = head;
        
        while(left-- >1){
            curr.next = node1;
            node1 = node1.next;
            curr = curr.next;
        }

        while(right-- > 0){
            node2 = node2.next;
        }

        ListNode reverseNode = reverse(node1, node2);
        curr.next = reverseNode;

        return ans.next;
    }

    private ListNode reverse(ListNode n1, ListNode n2){
        ListNode prevNode = n1;
        ListNode currNode = n1.next;

        while(currNode != n2){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        n1.next = n2;
        n1 = prevNode;
        return n1;
    }
}