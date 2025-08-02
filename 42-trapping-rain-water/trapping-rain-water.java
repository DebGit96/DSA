class Solution {
    //2 pointer to deterine the min of left or right max
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int leftMax=height[l],rightMax=height[r];
        int trappedWater=0;
        while(l<r){
            if(rightMax<leftMax){
                rightMax=Math.max(rightMax,height[--r]);
                trappedWater+=rightMax-height[r];
            }
            else{
                leftMax=Math.max(leftMax,height[++l]);
                trappedWater+=leftMax-height[l];
            }
        }

        return trappedWater;
    }
}