// Last updated: 11/08/2026, 16:10:44
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            digits[i]++;
            if(digits[i]==10){
                digits[i]=0;
            }else {
                return digits;
            }
        }
        int[] newDigits = new int[n+1];
        newDigits[0] =1;
        return newDigits;
    }
}