// Last updated: 11/08/2026, 16:01:57
class Solution {
    public int maxPower(String s) {
        int max = 1;
        int curmax = 1;
        for(int ind = 1; ind<s.length(); ind++){
            if(s.charAt(ind) == s.charAt(ind-1)){
                curmax++;
            }else {
                curmax = 1;
            }
            max = Math.max(curmax, max);
        }
        return max;
    }
}