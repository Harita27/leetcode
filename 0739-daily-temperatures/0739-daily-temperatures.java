class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> st=new Stack<>();
        int n=temp.length;
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[i]>=st.peek()[0]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=st.peek()[1]-i;
            }
            st.push(new int[]{temp[i],i});
        }
        return res;
    }
}