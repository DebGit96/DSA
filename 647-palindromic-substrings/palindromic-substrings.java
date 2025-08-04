class Solution {
    public int countSubstrings(String s) {
        char[] sInChars=s.toCharArray();
        int[] count={0};
        for(int i=0;i<s.length();++i){
            checkAndCountPalindromes(i,i, count,sInChars); //for odd length
            checkAndCountPalindromes(i,i+1, count,sInChars); //for evel length
        }
        return count[0];
    }

    void checkAndCountPalindromes(int l,int r,int[] count,final char[] sInChars){
        while(l>=0 && r<sInChars.length && sInChars[l]==sInChars[r]){
            count[0]++;
            l--;
            r++;
        }
        
    }
}