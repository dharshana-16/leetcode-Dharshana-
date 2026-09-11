// Last updated: 11/09/2026, 09:15:51
1class Solution {
2    public int tribonacci(int n) {
3        if(n<2){
4            return n;
5        }
6        int prev0 =0;
7        int prev1 = 1;
8        int current = 1;
9        for(int i=2; i<n; i++){
10            int next = prev0 + prev1 + current;
11            prev0 = prev1;
12            prev1 = current;
13            current = next;
14        }
15        return current;
16    }
17}