// Last updated: 11/08/2026, 16:00:46
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for(int i=n-1; i>=n-k; i--){
            long normal = nums[i];
            long multiply = (long)nums[i]*mul;
            ans += Math.max(normal, multiply);
            mul--;
        }
        return ans;
    }
}