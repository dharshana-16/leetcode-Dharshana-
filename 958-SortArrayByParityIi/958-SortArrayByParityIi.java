// Last updated: 11/08/2026, 16:03:27
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenind = 0;
        int oddint = 1;
        int res [] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                res[evenind]= nums[i];
                evenind+=2;
            }else{
                res[oddint] = nums[i];
                oddint+=2;
            }
        }
        return res;
    }
}