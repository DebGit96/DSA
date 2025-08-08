class Solution {
    public String longestCommonPrefix(String[] strs) {
        int ptr=0;
        String lcp="";

        while(true){
            if(ptr>strs[0].length()-1){
                return lcp;
            }
            char c=strs[0].charAt(ptr);
            for(int i=1;i<strs.length;++i){
                if(ptr>strs[i].length()-1 || c!=strs[i].charAt(ptr)){
                    return lcp;
                }
            }
            lcp+=c;
            ptr++;
        }
    }
}