// Last updated: 11/08/2026, 16:05:47
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(new StringBuilder(word).reverse().append(" "));
        }
        return result.toString().trim();
    }
}