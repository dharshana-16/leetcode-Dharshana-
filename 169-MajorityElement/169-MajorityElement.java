// Last updated: 11/08/2026, 16:08:59
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int n = nums.length/2;

        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        for(int i : map.keySet()){
            if(map.get(i) > n){
                return i;
            }
        }

        return -1;
    }
}