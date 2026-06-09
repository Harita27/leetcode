class Solution {
    static int[] NSE(int[] arr) {
        int[] nums=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()){
                nums[i]=arr.length-1;
            }
            else{
                nums[i]=st.peek()-1;
            }
            st.push(i);
        }
        return nums;
    }
    static int[] PSE(int[] arr) {
        int[] nums=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()){
                nums[i]=0;
            }
            else{
                nums[i]=st.peek()+1;
            }
            st.push(i);
        }
        return nums;
    }
    public int largestRectangleArea(int[] heights){
        int len=heights.length;
        int maxArea=0;int count=1;
        int[] arr1=NSE(heights);
        int arr2[]=PSE(heights);
        for(int i=0;i<heights.length;i++){
            maxArea=Math.max(maxArea,(Math.abs(arr1[i]-arr2[i])+1)*heights[i]);
        }
        return maxArea;
    }
}