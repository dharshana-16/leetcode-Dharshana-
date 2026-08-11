// Last updated: 11/08/2026, 16:06:24
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        if (s.size() < 3) return Collections.max(s);
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));
        return Collections.max(s);
    }
}