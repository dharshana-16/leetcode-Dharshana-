// Last updated: 11/08/2026, 16:07:42
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candit1 = 0, candit2 = 0;
        for(int i : nums){
            if(count1 ==0 && i != candit2){
                count1 = 1;
                candit1 = i;
            }else if(count2 == 0 && i != candit1){
                count2 = 1;
                candit2 = i;
            }else if(i == candit1){
                count1++;
            }else if(i == candit2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.length/3;
        count1 = 0; count2 = 0;
        for(int i : nums){
            if(i == candit1)count1++;
            else if(i == candit2)count2++;
        }
        if(count1 > n) res.add(candit1);
        if(count2 > n) res.add(candit2);
        return res;
    }
}