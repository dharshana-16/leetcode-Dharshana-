// Last updated: 11/08/2026, 16:12:15
public class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        int index = 0;
        int length = s.length();
        int sign = 1;
        int result = 0;
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }
        if (index < length) {
            char currentChar = s.charAt(index);
            if (currentChar == '-') {
                sign = -1;
                index++;
            } else if (currentChar == '+') {
                index++;
            }
        }
        while (index < length) {
            char currentChar = s.charAt(index);
            if (!Character.isDigit(currentChar)) {
                break;
            }
            int digit = currentChar - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
}
