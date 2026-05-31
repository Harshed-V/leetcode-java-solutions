class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int a:nums){
            result=result^a;
        }return result;
    }
}
