// Last updated: 11/08/2026, 16:12:34
import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int start = 0; 
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1;
            }
            map.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));  
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));     
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   
    }
}

