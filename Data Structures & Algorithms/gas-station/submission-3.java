class Solution {
    private int sum(int[] array){
        int result = 0;
        for(int x : array) result += x;

        return result;
    }

    private boolean tryGo(int startIndex, int[] gas, int[] cost){
        int currentIndex = startIndex + 1;
        int gasTank = gas[startIndex] - cost[startIndex];
        while(true){
            if(currentIndex >= gas.length) currentIndex = 0;
            gasTank += gas[currentIndex] - cost[currentIndex];
            if(gasTank < 0) break;
            if(currentIndex == startIndex) return true;
            currentIndex++;
        }
        return false;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas) < sum(cost)) return -1;

        for(int startIndex = 0; startIndex < gas.length; startIndex++){
            if(gas[startIndex] >= cost[startIndex]){
                if(tryGo(startIndex, gas, cost)) return startIndex;
            }
        }
        return -1;
    }
}
