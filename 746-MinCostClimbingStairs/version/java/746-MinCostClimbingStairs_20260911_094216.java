// Last updated: 11/09/2026, 09:42:16
1class Solution {
2    public int[] countBits(int n) {
3
4        int[] ans = new int[n + 1];
5
6        for (int i = 1; i <= n; i++) {
7            ans[i] = ans[i / 2] + i % 2;
8        }
9
10        return ans;
11    }
12}