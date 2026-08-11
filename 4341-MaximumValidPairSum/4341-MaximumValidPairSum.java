// Last updated: 11/08/2026, 16:00:45
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int[] prefixMax = new int[n];
        prefixMax[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixMax[i] = Math.max(prefixMax[i-1],nums[i]);
        }
        int ans = Integer.MIN_VALUE;
        for(int j=k; j<n; j++){
            ans = Math.max(ans,prefixMax[j-k]+ nums[j]);
        }
        return ans;
    }
}