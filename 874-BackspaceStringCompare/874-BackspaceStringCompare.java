// Last updated: 11/08/2026, 16:03:50
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> str1 = new Stack<>();
        Stack<Character> str2 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c!='#'){
                str1.push(c);
            }else if(!str1.isEmpty()){
                str1.pop();
            }
        }
        for(char c : t.toCharArray()){
            if(c!='#'){
                str2.push(c);
            }else if(!str2.isEmpty()){
                str2.pop();
            }
        }
        return str1.equals(str2);
    }
}