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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        curr = stack.pop();
        ListNode resNode = new ListNode(curr.val);
        int maxValue = curr.val;

        while(!stack.isEmpty()){
            curr = stack.pop();
            if(curr.val < maxValue) continue;
            else{
                ListNode node = new ListNode(curr.val);
                node.next = resNode;
                resNode = node;
                maxValue = curr.val;
            }
        }
        return resNode;
    }
}