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
        private ListNode reverse(ListNode node){
            ListNode pre = null;
            ListNode next = null;
            while(node!= null){
                next = node.next;
                node.next = pre;
                pre = node;
                node = next;
            }
            return pre;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            l1 = reverse(l1);
            l2 = reverse(l2);
            ListNode head = null;
            int remember = 0;
            ListNode current = null;

            while(l1 != null && l2 != null){
                int sum = l1.val + l2.val + remember;
                if(sum > 9){
                    remember = 1;
                    sum %= 10;
                } else {
                    remember = 0;
                }

                ListNode newNode = new ListNode(sum);
                if(head == null) {
                    head = newNode;
                    current = newNode;
                } else {
                    current.next = newNode;
                    current = newNode;
                }

                l1 = l1.next;
                l2 = l2.next;
            }

            while(l1 != null){
                int sum = l1.val + remember;
                if(sum > 9){
                    remember = 1;
                    sum %= 10;
                } else {
                    remember = 0;
                }

                ListNode newNode = new ListNode(sum);

                current.next = newNode;
                current = newNode;

                l1 = l1.next;
            }

            while(l2 != null){
                int sum = l2.val + remember;
                if(sum > 9){
                    remember = 1;
                    sum %= 10;
                } else {
                    remember = 0;
                }

                ListNode newNode = new ListNode(sum);

                current.next = newNode;
                current = newNode;

                l2 = l2.next;
            }

            if(remember == 1) current.next = new ListNode(1);
            return reverse(head);
        }
    }