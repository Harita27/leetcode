class Solution {
    public void duplicateZeros(int[] arr) {
        int[] cpyArr=arr.clone();
        int length=arr.length;
        int index=0;
        for (int i=0;i<length&&index<length;i++) {
            if (cpyArr[i]==0) {
                arr[index++]=cpyArr[i];
                if (index<length) arr[index++]=0;
            } else arr[index++]=cpyArr[i];
        }
    }
}