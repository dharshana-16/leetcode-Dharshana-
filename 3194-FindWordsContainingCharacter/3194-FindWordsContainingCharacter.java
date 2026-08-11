// Last updated: 11/08/2026, 16:01:12
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList();
        for(int i=0; i<words.length; i++){
            if(words[i].contains(Character.toString(x)))ans.add(i);
        }
        return ans;
    }
}