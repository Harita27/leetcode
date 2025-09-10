class Solution {
    private static final int MOD = 1_000_000_007;
    public int countAnagrams(String s) {
        String[] words=s.split(" ");
        long ans=1;
        for(String word:words){
            ans=(ans*countwordAnagrams(word))%MOD;
        }
        return (int) ans;
    }
    private long countwordAnagrams(String word){
        int n=word.length();
        long numerator=1;
        for(int i=1;i<=n;i++){
            numerator=(numerator*i)% MOD;
        }
        int count[]=new int[26];
        for(char c:word.toCharArray()){
            count[c-'a']++;
        }
        long denominator=1;
        for(int freq:count){
            if(freq>1){
                denominator=(denominator*factorial(freq)) % MOD;
            }
        }
        return(numerator * modPow(denominator,MOD-2)) % MOD;
    }
    private long factorial(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res=(res*i)%MOD;
        }
        return res;
    }
    private long modPow(long a,long b){
        long res=1;
        while(b>0){
            if((b&1)==1){
                res=(res*a)% MOD;
            }
            a=(a*a)%MOD;
            b>>=1;
        }
        return res;
    }
}