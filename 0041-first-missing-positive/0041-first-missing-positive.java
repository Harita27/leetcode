class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for (int n : nums) {
            if (n > 0 && n == res) {
            res++;
            } else if (n > res) {
                return res;
            }
        }
        return res;
    }
}