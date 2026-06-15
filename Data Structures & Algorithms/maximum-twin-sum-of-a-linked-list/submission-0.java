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
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int result = 0; 

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        stack.push(slow.val);

        while(slow.next != null){
            slow = slow.next;
            result = Math.max(stack.pop() + slow.val, result);
        }
        return result;
    }
}