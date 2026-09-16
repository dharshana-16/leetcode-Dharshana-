// Last updated: 16/09/2026, 10:00:02
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        int n = nums.length;
4        long sum = 0;
5        Map<Long, Long> map = new HashMap<>();
6        long ans = Long.MIN_VALUE;
7        sum=0;
8        for(int i=0; i<n; i++) {
9            int num = nums[i];
10            sum+= num;
11            long key = num+k;
12            if(map.containsKey(key)) {
13                ans = Math.max(ans, sum - map.get(key));
14            }
15            key = num-k;
16            if(map.containsKey(key)) {
17                ans = Math.max(ans, sum - map.get(key));
18            }
19            key = num;
20            if(!map.containsKey(key)) map.put(key, sum-num);
21            else {
22                long f = map.get(key);
23                if(sum-num < f) map.put(key, sum-num);
24            }
25        }
26
27        return ans == Long.MIN_VALUE ? 0 : ans;
28    }
29}