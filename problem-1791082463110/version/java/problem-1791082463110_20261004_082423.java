// Last updated: 04/10/2026, 08:24:23
1class Solution {
2    public int minRotations(int n, String s) {
3        int[] d = new int[n];
4        for(int i=0; i<n; i++){
5            d[i] = s.charAt(i) - '0';
6        }
7        int[]cost = new int[n];
8        int diff0 = Math.abs(d[0]);
9        cost[0] = Math.min(diff0, 10 - diff0);
10        
11        for(int i=1;i<n; i++){
12            int diff = Math.abs(d[i]- d[i-1]);
13            cost[i] = Math.min(diff, 10 - diff);
14        }
15        int[]pref = new int[n+1];
16        for(int i=0; i<n; i++){
17            pref[i+1]=pref[i]+cost[i];
18        }
19        int minTotal = pref[n];
20        for(int k=0; k<n; k++){
21            int prefixCost = pref[k];
22            int suffixInternalCost = pref[n]-pref[k+1];
23
24            int preDigit = (k==0) ? 0 : d[k-1];
25            int diffBridge = Math.abs(preDigit- d[n-1]);
26            int bridgeCost = Math.min(diffBridge, 10 - diffBridge);
27            int total = prefixCost + bridgeCost + suffixInternalCost;
28            minTotal = Math.min(minTotal, total);
29        }
30        return minTotal;
31    }
32}