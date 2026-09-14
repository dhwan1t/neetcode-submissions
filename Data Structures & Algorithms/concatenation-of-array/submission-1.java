class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            int nextInd = i+nums.length;
            res[i] = nums[i];
            res[nextInd] = res[i];
        }
        return res;
    }
}