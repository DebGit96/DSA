class Solution {
    // optimal space but o(n) operations even if multiple 0s are already present
    public void moveZeroes(int[] nums) {
        int fillPtr=0,searchPtr=0;
        int len=nums.length;

        while(searchPtr<len){
            if(nums[searchPtr]!=0){
                nums[fillPtr++]=nums[searchPtr];
            }
            searchPtr++;
        }

        while(fillPtr<len){
            nums[fillPtr++]=0;
        }
    }
}