class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> comb=new ArrayList<>();
        formParan(n,n,new StringBuilder(),comb);
        return comb;
    }

    void formParan(int o,int c,StringBuilder op,List<String> opList){
        if(o==0 && c==0){
            opList.add(op.toString());
            return;
        }

        if(o>0){
            op.append("(");
            formParan(o-1,c,op,opList);
            op.deleteCharAt(op.length()-1);
        }

        if(c>o){
            op.append(")");
            formParan(o,c-1,op,opList);
            op.deleteCharAt(op.length()-1);
        }
        
    }
}