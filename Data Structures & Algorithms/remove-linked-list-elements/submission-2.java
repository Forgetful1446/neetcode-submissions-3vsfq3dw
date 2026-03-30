class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode preCur = head;
        if(head == null) return head;
        while(cur!= null){
            if(cur.val == val){
                preCur.next = cur.next;
                cur = cur.next;
                continue;
            }
            preCur = cur;
            cur = cur.next;
        }

        while(head != null && head.val == val) head = head.next;
        return head;
    }
}