class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        leftmax[0] = height[0];
        rightmax[n-1]=height[n-1];

        int water = 0;
        
        for(int i=1, j=n-2;i<n;i++,j--){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
            rightmax[j] = Math.max(rightmax[j+1], height[j]);
        }
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]) - height[i];
            water += waterLevel;
        }


        return water;
    }
}
