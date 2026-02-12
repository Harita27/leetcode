class Solution {
    public boolean isvalid(String s){
        int bal=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(') bal++;
        else if(s.charAt(i)==')') bal--;
        if(bal<0) return false;
       }
       return bal==0;
    }
    public void generateAll(String curr,int n, List<String> res){
        if(curr.length()==2*n){
            if(isvalid(curr)) res.add(curr);
            return;
        }
        generateAll(curr+'(',n,res);
        generateAll(curr+')',n,res);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll("",n,result);
        return result;
    }
}