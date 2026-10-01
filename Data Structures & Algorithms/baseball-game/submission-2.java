class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> score = new Stack<>();
        for(String x : operations){
            if(x.equals("C") && !score.isEmpty()){
                score.pop();
            } else if (x.equals("D") && !score.isEmpty()){
                score.push(score.peek() * 2);
            } else if (x.equals("+")){
                if (score.size() >= 2){
                    int temp = score.pop();
                    int temp2 = score.peek();
                    score.push(temp);
                    score.push(temp + temp2);
                }
            } else {
                score.push(Integer.parseInt(x));
            }
        }
        while(!score.isEmpty()) sum += score.pop();

        return sum;
    }
}