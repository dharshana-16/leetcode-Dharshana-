// Last updated: 11/08/2026, 16:10:53
class Solution {
    public int lengthOfLastWord(String s) {
       int length =0;
       for(int i=s.length()-1; i>=0; i--){
        if(s.charAt(i) != ' '){
            length++;
        }else{
            if(length > 0){
                return length;
            }
        }
       }
       return length;
    }
}