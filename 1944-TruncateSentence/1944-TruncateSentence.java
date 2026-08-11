// Last updated: 11/08/2026, 16:01:46
class Solution {
    public String truncateSentence(String s, int k) {
        int c =0;
        for(int i=-0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                c+=1;
            }
            if(c==k){
                return s.substring(0,i);
            }
        }
        return s;
    }
}