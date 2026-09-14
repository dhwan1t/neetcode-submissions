class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            res[i] = nums[i];
        }
        int i = nums.length;
        int j = 0;
        while(i < res.length && j<nums.length){
            res[i] = nums[j];
            i++;
            j++;
        }
        return res;
    }
}