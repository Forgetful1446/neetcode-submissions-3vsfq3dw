class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean x = false;
        boolean y = false;
        boolean z = false;

        for(int[] triplet : triplets){
            if(triplet[0] == target[0] && triplet[1] <= target[1] && triplet[2] <=  target[2]) x = true;
            if(triplet[1] == target[1] && triplet[0] <= target[0] && triplet[2] <=  target[2]) y = true;
            if(triplet[2] == target[2] && triplet[0] <= target[0] && triplet[1] <=  target[1]) z = true;
        }

        return x && y && z;
    }
}
