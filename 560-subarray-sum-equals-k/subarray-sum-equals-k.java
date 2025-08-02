class Solution {
    //prefix Sum and hashmap
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefSumMap=new HashMap<>();
        int prefSum=0,count=0;
        prefSumMap.put(prefSum,1);

        for(int i=0;i<nums.length;++i){
            prefSum+=nums[i];
            if(prefSumMap.containsKey(prefSum-k)){
                count+=prefSumMap.get(prefSum-k);
            }
            prefSumMap.put(prefSum,prefSumMap.getOrDefault(prefSum,0)+1);
        }

        return count;
    }
}