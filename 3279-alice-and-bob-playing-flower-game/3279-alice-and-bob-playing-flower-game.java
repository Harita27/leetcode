class Solution {
    public long flowerGame(int n, int m) {
        long XEven=n/2;
        long YEvem=m/2;
        long Xodd=(n+1)/2;
        long Yodd=(m+1)/2;
        return(XEven*Yodd + YEvem*Xodd);
    }
}