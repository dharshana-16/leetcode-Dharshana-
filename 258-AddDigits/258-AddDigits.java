// Last updated: 11/08/2026, 16:07:27
class Solution {
    public int addDigits(int num) {
        if(num == 0)
        return 0;
        return 1+ (num-1) %9;
    }
}