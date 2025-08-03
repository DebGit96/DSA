class Solution {
    public void sortColors(int[] nums) {
        int p0=0,p2=nums.length-1,cur=0;

        while(cur<=p2){
            switch(nums[cur]){
                case 0 : 
                        swap(nums,cur,p0);
                        p0++;
                        cur++;
                        break;
                case 1 :
                        cur++;
                        break;
                case 2 :
                        swap(nums,cur,p2);
                        p2--;
            }
        }
    }

    void swap(int[] nums,int ind1,int ind2){
        int tmp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=tmp;
    }
}