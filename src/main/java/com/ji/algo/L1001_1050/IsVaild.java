package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/21
    time 10:52 AM
*/

import java.util.Stack;

public class IsVaild {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
    }

    public static boolean isValid(String S) {
        if (S.length() % 3 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'a':
                    stack.push('a');
                    break;
                case 'b':
                    if (stack.isEmpty())
                        return false;
                    if (stack.peek() != 'a')
                        return false;
                    stack.push('b');
                    break;
                default:
                    if (stack.isEmpty())
                        return false;
                    if (stack.pop() != 'b')
                        return false;
                    if (stack.isEmpty())
                        return false;
                    if (stack.pop() != 'a')
                        return false;
            }
        }
        return stack.isEmpty();
    }
}
