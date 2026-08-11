// Last updated: 11/08/2026, 16:00:58
class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        for(int i=1; i<s.length();i++){
            if(s.charAt(i) !=s.charAt(i-1)){
                count ++;
            }
        }
        return count;
    }
}