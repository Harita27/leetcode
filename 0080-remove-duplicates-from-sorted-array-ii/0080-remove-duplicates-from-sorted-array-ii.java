class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])<2){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                nums[j++]=nums[i];
            }
            else if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
                nums[j++]=nums[i];
            }
            else if(map.get(nums[i])>=2){
                continue;
            }
        }
        return j;
    }
}