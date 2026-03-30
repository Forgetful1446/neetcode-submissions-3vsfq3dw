class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        
        if(count  == 1){
            head = null;
            return head;
        }

        int removeIndex = count - n;
        if (removeIndex == 0){
            head = head.next;
            return head;
        }

        count = 0;
        temp = head;
        ListNode prev = null;
        while(count != removeIndex){
            count++;
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;
    }
}