// Last updated: 21/09/2026, 19:30:15
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        List<List<Integer>> ans = new ArrayList<>();
4        HashMap<Integer, Integer> hm = new HashMap<>();
5        for (int i = 0; i < matches.length; i++) {
6            hm.put(matches[i][1], hm.getOrDefault(matches[i][1], 0) + 1);
7            hm.put(matches[i][0], hm.getOrDefault(matches[i][0], 0));
8        }
9        ans.add(new ArrayList<>());
10        ans.add(new ArrayList<>());
11        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
12            if (entry.getValue() == 0)
13                ans.get(0).add(entry.getKey());
14            else if (entry.getValue() == 1)
15                ans.get(1).add(entry.getKey());
16        }
17        Collections.sort(ans.get(0));
18        Collections.sort(ans.get(1));
19
20        return ans;
21    }
22}