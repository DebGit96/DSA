class Solution {
    //2 pointer to deterine the min of left or right max
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int leftMax=height[l],rightMax=height[r];
        int trappedWater=0;
        while(l<r){
            int curTrap=0;
            if(rightMax<leftMax){
                curTrap=rightMax-height[r--];
                rightMax=Math.max(rightMax,height[r]);
                
            }
            else{
                curTrap=leftMax-height[l++];
                leftMax=Math.max(leftMax,height[l]);
            }

            if(curTrap>0){
                trappedWater+=curTrap;
            }
        }

        return trappedWater;
    }
}