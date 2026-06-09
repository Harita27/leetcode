class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int len=heights.length;
        int max=0;int count=1;
        for(int i=0;i<=len;i++){
            int currHeight=0;
            if(i<len) currHeight=heights[i];
            while (!st.isEmpty() && heights[st.peek()]>currHeight){
                int height=heights[st.pop()];
                int right=i;int left=0;
                if(st.isEmpty()){
                   left=-1;
                }
                else{
                    left=st.peek();
                }
                int width=right-left-1;
                max=Math.max(max,height*width);
            }
            if(i<len)
            st.push(i);
        }
        return max;
    }
}