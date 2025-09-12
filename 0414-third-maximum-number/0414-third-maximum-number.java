class Solution {
    public int thirdMax(int[] arr) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int num : arr) {
            if (num == first || num == second || num == third) continue;
            if(num>first){
                third=second;
                second=first;
                first=num;
            }else if(num>second && num!=first){
                third=second;
                second=num;
            }else if( num>third && num!=second && num!=first){
                third=num;
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}