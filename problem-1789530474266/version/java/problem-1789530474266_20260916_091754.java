// Last updated: 16/09/2026, 09:17:54
1class Solution {
2    public int findComplement(int num) {
3        int ans = 0;
4        int power = 1;
5        while (num > 0) {
6            int bit = num % 2;
7            if (bit == 0) {
8                ans += power;
9            }
10            num = num / 2;
11            power = power * 2;
12        }
13        return ans;
14    }
15}