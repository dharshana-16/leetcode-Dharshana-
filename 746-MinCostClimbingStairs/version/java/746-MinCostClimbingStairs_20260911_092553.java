// Last updated: 11/09/2026, 09:25:53
1class NumArray {
2    private int[] pre;
3    public NumArray(int[] nums) {
4        int n = nums.length;
5        pre = new int[n+1];
6
7        pre[0] = 0;
8        for(int i = 1;i<=n;i++){
9            pre[i] = pre[i-1] + nums[i-1];
10        }    
11    }
12    
13    public int sumRange(int left, int right) {
14        return pre[right+1] - pre[left];
15    }
16}