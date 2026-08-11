// Last updated: 11/08/2026, 16:09:29
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result^=num;
        }
         return result;
    }
}