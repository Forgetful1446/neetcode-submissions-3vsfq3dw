class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode myHead = null;
        int num1 = 0;
        int num2 = 0;
        int count = 1;
        while(l1 != null){
            num1 += l1.val * count;
            count *= 10;
            l1 = l1.next;
        }
        count = 1;
        while(l2 != null){
            num2 += l2.val * count;
            count *= 10;
            l2 = l2.next;
        }
        int myNum = num1 + num2;
        if (myNum == 0) {
            return new ListNode(0);
        }
        
        ListNode pre = null;
        while(myNum != 0){
            ListNode newNode = new ListNode(myNum % 10);
            myNum /= 10;
            if(myHead == null){
                myHead = newNode;
            } else {
                pre.next = newNode;
            }
            pre = newNode;
        }
        
        return myHead;
    }
}
