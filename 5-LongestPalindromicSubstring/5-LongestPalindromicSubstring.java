// Last updated: 11/08/2026, 16:12:27
public class Solution {
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longestPalindromicSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            String palindrome1 = expandAroundCenter(s, i, i);
            String palindrome2 = expandAroundCenter(s, i, i + 1);
            if (palindrome1.length() > longestPalindromicSubstring.length()) {
                longestPalindromicSubstring = palindrome1;
            }
            if (palindrome2.length() > longestPalindromicSubstring.length()) {
                longestPalindromicSubstring = palindrome2;
            }
        }
        return longestPalindromicSubstring;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad")); 
        System.out.println(solution.longestPalindrome("cbbd"));   
    }
}
