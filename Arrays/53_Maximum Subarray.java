class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0, maximum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            maximum = Math.max(cs, maximum);
            if(cs<0) cs = 0;
        }return maximum;
    }
}
