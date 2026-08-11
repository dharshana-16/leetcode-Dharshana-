// Last updated: 11/08/2026, 16:01:52
class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : "aeiouAEIOU".toCharArray())
        set.add(c);
        int count = 0;
        for(int i=0; i< s.length() /2; i++){
            if(set.contains(s.charAt(i))) count++;
            if(set.contains(s.charAt(i+s.length()/2))) count--;
        }
        return count == 0;
    }
}