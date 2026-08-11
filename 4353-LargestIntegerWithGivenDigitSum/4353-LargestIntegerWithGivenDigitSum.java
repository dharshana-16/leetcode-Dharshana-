// Last updated: 11/08/2026, 16:00:40
class Solution {
    public int largestInteger(int n, int s) {
        if(s == 0){
            return 0;
        }
        if(s > 9 * n || s < 0){
            return -1;
        }
        int result = 0;
        for(int i=0; i<n; i++){
            int digit = Math.min(9,s);
            result = result * 10 + digit;
            s-=digit;
        }
        return result;
    }
}