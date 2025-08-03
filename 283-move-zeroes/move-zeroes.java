class Solution {
    // optimal space and optimal o(n) operations only no. of non 0 element operations
    public void moveZeroes(int[] nums) {
        int fillPtr=0,searchPtr=0;
        int len=nums.length;

        while(searchPtr<len){
            if(nums[searchPtr]!=0){
                swap(nums,fillPtr++,searchPtr);
            }
            searchPtr++;
        }
    }

    void swap(int nums[],int ind1,int ind2){
        int tmp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=tmp;
    }
}