class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        int n = nums.length;

        for(int a:nums){
            if(a==1){
                current++;
                max = Math.max(max,current);
            }else current =0; 
        }
        return max;
    }
}
