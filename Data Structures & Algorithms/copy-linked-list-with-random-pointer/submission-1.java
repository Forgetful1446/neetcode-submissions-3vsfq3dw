class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        Node myHead = null;
        Node pre = null;

        while(temp != null){
            Node newNode = new Node(temp.val);
            if(map.isEmpty()){
                myHead = newNode;
            } else {
                pre.next = newNode;  
            }
            pre = newNode;
            map.put(temp,newNode);
            temp = temp.next;
        }

        temp = head;
        Node myTemp = myHead;
        while(temp != null && myTemp != null){
            myTemp.random = map.get(temp.random);
            myTemp = myTemp.next;
            temp = temp.next;
        }

        return myHead;
    }
}