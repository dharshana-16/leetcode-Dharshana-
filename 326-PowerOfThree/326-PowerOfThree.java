// Last updated: 11/08/2026, 16:07:04
class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOf3 = 1162261467;
        return n > 0&& maxPowerOf3 % n == 0;
    }
}