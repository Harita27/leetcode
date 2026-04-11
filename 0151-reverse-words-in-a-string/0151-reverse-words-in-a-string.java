class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.trim().split("\\s+");;
        int low=0;
        int high=arr.length-1;
        while(low < high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        StringBuilder st = new StringBuilder();        
        for(int i = 0;i < arr.length; i++){
            st.append(arr[i]);
            if(i != arr.length - 1){
                st.append(" ");
            }
        }        
        return st.toString();
        
    }
}