// Last updated: 27/09/2026, 08:39:29
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3       if(nums == null || nums.length <= 1){
4           return 0;
5       }
6        int basePairs = 0;
7        Map<String, Integer> pairFreq = new HashMap<>();
8        int maxGain =0;
9        for(int i =0; i<nums.length-1; i++){
10            int u = nums[i];
11            int v = nums[i+1];
12            if(u==v){
13                basePairs++;
14            }else{
15                int min = Math.min(u,v);
16                int max = Math.max(u,v);
17                String key = min + "#" + max;
18                int count = pairFreq.getOrDefault(key, 0)+1;
19                pairFreq.put(key, count);
20                if(count >maxGain){
21                    maxGain = count;
22                }
23            }
24        }
25        return basePairs + maxGain;
26    }
27}