class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows == 1) return result;

        List<Integer> secondRow = new ArrayList<Integer>();
        secondRow.add(1);
        secondRow.add(1);
        result.add(secondRow);
        

        for(int i = 2; i < numRows; i++){
            List<Integer> sublist = new ArrayList<Integer>();
            sublist.add(1);
            List<Integer> lastRow = result.getLast();
            for(int j = 0; j < lastRow.size() - 1; j++){
                sublist.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            sublist.add(1);
            result.add(sublist);
        }

        return result;
    }
}