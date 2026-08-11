// Last updated: 11/08/2026, 16:11:45
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] phoneMap = new String[]{
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String[] phoneMap, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(result, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
