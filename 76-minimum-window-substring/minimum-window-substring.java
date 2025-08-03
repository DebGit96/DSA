class Solution {
    public String minWindow(String s, String t) {
        int sLen=s.length();
        char[] tInChars=t.toCharArray();
        char[] sInChars=s.toCharArray();
        Map<Character,Integer> freqMap= new HashMap<>();
        for(char c : tInChars){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        int disCharCount=freqMap.size();
        int start=0,end=0,minLen=sLen;;
        String subString="";

        while(end<sLen){
            char endChar=sInChars[end];
            if(freqMap.containsKey(endChar)){
                freqMap.put(endChar,freqMap.get(endChar)-1);
                if(freqMap.get(endChar)==0){
                    disCharCount--;
                }
            }
            

            while(disCharCount==0){
                int curWinLen=end-start+1;
                if(curWinLen<=minLen){
                    minLen=curWinLen;
                    subString=s.substring(start,end+1);
                }

                char startChar=sInChars[start];
                if(freqMap.containsKey(startChar)){
                    freqMap.put(startChar,freqMap.get(startChar)+1);
                    if(freqMap.get(startChar)==1){
                        disCharCount++;
                    }
                }
                start++;
            }
            end++;
        }

        return subString;
    }
}