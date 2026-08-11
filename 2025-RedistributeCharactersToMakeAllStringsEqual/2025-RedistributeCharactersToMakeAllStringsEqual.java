// Last updated: 11/08/2026, 16:01:33
class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int[] totalFreq = new int[26];
        for(String str : words){
            for(char ch : str.toCharArray()){
                totalFreq[ch - 'a']++;
            }
        }
        for(int count : totalFreq){
            if(count % n > 0 || count % n < 0) return false;
        }
        return true;
    }
}