// Last updated: 11/08/2026, 16:08:16
class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] num, int left, int right) {
        while (left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
    }
}