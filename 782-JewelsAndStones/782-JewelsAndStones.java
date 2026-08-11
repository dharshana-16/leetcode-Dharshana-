// Last updated: 11/08/2026, 16:04:14
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num =0;
        for(int i=0; i<stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) !=-1){
                num++;
            } 
        }
        return num;
    }
}