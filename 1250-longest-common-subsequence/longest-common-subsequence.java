class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] t1InCh=text1.toCharArray();
        char[] t2InCh=text2.toCharArray();
        int l1=0,l2=0;
        int[][] memo= new int[t1InCh.length][t2InCh.length];
        for (int i = 0; i < t1InCh.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        return f(t1InCh,t2InCh,l1,l2,memo);
    }

    int f(char[] t1InCh,char[] t2InCh,int l1,int l2, int[][] memo){
        if(l1>=t1InCh.length || l2>=t2InCh.length){
            return 0;
        }

        if(memo[l1][l2]!=-1){
            return memo[l1][l2];
        }

        if(t1InCh[l1]==t2InCh[l2]){
            memo[l1][l2]=1+f(t1InCh,t2InCh,l1+1,l2+1,memo); 
        }

        else{
                memo[l1][l2]= Math.max(f(t1InCh,t2InCh,l1+1,l2,memo),f(t1InCh,t2InCh,l1,l2+1,memo));
        }
        return memo[l1][l2];
    }
}