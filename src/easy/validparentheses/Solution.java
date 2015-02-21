package easy.validparentheses;

import java.util.LinkedList;

public class Solution {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        String left = "({[";
        String right = ")}]";
        LinkedList<Character> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (left.indexOf(c) != -1) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char r = stack.pop();
                    if (right.indexOf(c) != left.indexOf(r)) {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}