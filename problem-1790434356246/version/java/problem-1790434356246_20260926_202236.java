// Last updated: 26/09/2026, 20:22:36
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3       if(source.length != target.length){
4           return false;
5       }
6        if(source.length == 1){
7            return source[0] == target[0];
8        }
9        long sumSource = 0;
10        long sumTarget = 0;
11        for(int x : source){
12            sumSource += x;
13        }
14        for(int x : target){
15            sumTarget += x;
16        }
17        return sumSource == sumTarget;
18    }
19}