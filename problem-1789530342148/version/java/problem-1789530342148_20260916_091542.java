// Last updated: 16/09/2026, 09:15:42
1class Solution {
2    public boolean isPowerOfFour(int n) {
3
4        if (n <= 0) return false;
5        if ((n & (n - 1)) != 0) return false;
6        return (n & 0x55555555) != 0; }
7}