class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> comb=new ArrayList<>();
        formParan(n,n,"",comb);
        return comb;
    }

    void formParan(int o,int c,String op,List<String> opList){
        if(o==0 && c==0){
            opList.add(op);
            return;
        }

        if(o==0){
            formParan(o,c-1,op+")",opList);
        }

        else if(o==c){
            formParan(o-1,c,op+"(",opList);
        }
        else if(c>o){
            formParan(o-1,c,op+"(",opList);
            formParan(o,c-1,op+")",opList);
        }
    }
}