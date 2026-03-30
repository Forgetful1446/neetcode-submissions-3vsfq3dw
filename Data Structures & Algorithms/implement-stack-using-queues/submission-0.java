class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int temp = q1.poll();
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return temp;
    }
    
    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int temp = q1.peek();
        q2.offer(q1.poll());
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return temp;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}