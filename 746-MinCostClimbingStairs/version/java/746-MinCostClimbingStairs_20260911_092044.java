// Last updated: 11/09/2026, 09:20:44
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int prev2 = cost[0];
4        int prev1 = cost[1];
5        for(int i=2; i<cost.length;i++){
6            int curr = cost[i] + Math.min(prev2, prev1);
7            prev2 = prev1;
8            prev1 = curr;
9        }
10        return Math.min(prev1, prev2);
11    }
12}