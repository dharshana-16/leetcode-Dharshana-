// Last updated: 11/08/2026, 16:06:38
class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++){
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
}