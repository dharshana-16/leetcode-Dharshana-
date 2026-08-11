// Last updated: 11/08/2026, 16:04:48
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        int[]countArray= new int[n+1];
        int[] result = new int[2];
        for(int num : nums){
            countArray[num]++;
        }
        for(int i=1; i<=n; i++){
            if(countArray[i]==2){
                result[0] = i;
            }
            if(countArray[i]==0){
                result[1] = i;
            }
        }
        return result;
    }
}