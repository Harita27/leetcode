class Solution {
    public boolean canMeasureWater(int jug1, int jug2, int target) {
        if (target>jug1+jug2) return false;
        if (target==0) return true;
        return target%gcd(jug1,jug2)==0;
    }

    private int gcd(int a, int b) {
        if (b==0) 
        return a;
        return gcd(b,a%b);
    }
}
