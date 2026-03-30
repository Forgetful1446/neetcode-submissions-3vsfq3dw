class Solution {
    private static ListNode rev(ListNode node){
        ListNode pre = null;
        ListNode cur = node;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head) {
        String a = "";
        String b = "";
        ListNode temp = head;
        while(temp != null){
            a += temp.val;
            temp = temp.next;
        }
        temp = rev(head);
        while(temp != null){
            b += temp.val;
            temp = temp.next;
        }

        return a.equals(b);
    }

}