package com.ji.ready202309;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/06/22:59
 */
public class L20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char s1 = stack.pop();
                if (s.charAt(i) == ')' && s1 != '(') {
                    return false;
                }
                if (s.charAt(i) == '}' && s1 != '{') {
                    return false;
                }
                if (s.charAt(i) == ']' && s1 != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
