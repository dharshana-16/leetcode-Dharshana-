// Last updated: 16/09/2026, 09:11:41
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n>0 && (n&(n-1))==0)
4        {
5            return true;
6        }
7        return false;
8    }
9}