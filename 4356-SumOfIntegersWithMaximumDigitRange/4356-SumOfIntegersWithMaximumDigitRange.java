// Last updated: 11/08/2026, 16:00:38
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum =0;
        for(int num : nums){
            int range = digitRange(num);
            if(range > maxRange){
                maxRange = range;
            }
        }
        for(int num : nums){
            if(digitRange(num) == maxRange){
                sum += num;
            }
        }
        return sum;
    }
    private int digitRange(int num){
        if(num == 0) return 0;
        int minDigit = 9;
        int maxDigit = 0;
        while(num > 0){
            int digit = num % 10;
            minDigit = Math.min(minDigit, digit);
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit - minDigit;
    }
}