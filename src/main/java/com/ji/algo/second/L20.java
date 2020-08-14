package com.ji.algo.second;

import java.util.List;
import java.util.Stack;

/**
 * user ji
 * data 2020/8/14
 * time 7:42 上午
 */
public class L20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                char t = stack.pop();
                switch (s.charAt(i)) {
                    case ')':
                        if (t != '(')
                            return false;
                        break;
                    case ']':
                        if (t != '[')
                            return false;
                        break;
                    case '}':
                        if (t != '{')
                            return false;
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
}
