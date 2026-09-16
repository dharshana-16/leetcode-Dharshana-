// Last updated: 16/09/2026, 10:13:56
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        long n = arr.length;
4        if(n==1) return 1;
5        int up = 1, down = 1, res = 1;
6        for(int i=1; i<n; i++){
7            if(arr[i] > arr[i-1]){
8                up = down +1;
9                down = 1;
10            } else if(arr[i] < arr[i-1]){
11                down = up +1;
12                up = 1;
13            } else{
14                up = down = 1;
15            }
16            res = Math.max(res, Math.max(up,down));
17        } 
18        return res;
19    }
20}