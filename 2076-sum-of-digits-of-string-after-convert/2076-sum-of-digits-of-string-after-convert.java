class Solution {
    public int sum(int a){
        int s=0;
        while(a>0){
            s+=a%10;
            a=a/10;
        }
        return s;
    }
    public int transform(int a,int k){
        int temp=a;
        while(k>0){
            temp=sum(temp);
            k--;
        }
        return temp;
    }
    public int getLucky(String s, int k) {
        int ans=0;
        for(char ch:s.toCharArray()){
            int a=ch-'a'+1;
            ans+=sum(a);
        }
        return transform(ans,k-1);
    }
}