class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo= new Boolean[s.length()];
        return check(0,s, dict,memo);
    }

    boolean check(int l, String s, Set<String> dict, Boolean[] memo) {
        if(memo[l]!=null){
            return memo[l];
        }

        for (int r = l; r < s.length(); ++r) {
            String curSubStr = s.substring(l, r + 1);
            if (dict.contains(curSubStr) && (r == s.length() - 1 || check(r + 1, s, dict,memo))) {
                memo[l]=true;;
                return true;
            }
        }

        memo[l]=false;
        return false;
    }
}
