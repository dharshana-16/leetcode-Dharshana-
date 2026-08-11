// Last updated: 11/08/2026, 16:07:17
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        int sum = 0;
        int num = 0;
        for(int i = 1; i <= nums.length; i++){
            sum += i;
        }
        for(int i = 0; i < nums.length; i++){
            num += nums[i];  
        }
        res = (sum - num);
        return res;
    }
}