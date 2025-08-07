class Solution {
    //dp bottom up
    public boolean wordBreak(String s, List<String> wordDict) {
        int sLen=s.length();
        boolean[] memo=new boolean[sLen+1];
        Arrays.fill(memo,false);
        memo[sLen]=true;

        for(int i=sLen-1;i>=0;--i){
            for(String word : wordDict){
                int wordLen=word.length();
                int subStrEndInd=i+wordLen-1;
                if(subStrEndInd<sLen && s.substring(i,subStrEndInd+1).equals(word)){
                    memo[i]=memo[i+wordLen];
                    if(memo[i]){
                        break;
                    }
                }
            }
        }

        return memo[0];
    }
}