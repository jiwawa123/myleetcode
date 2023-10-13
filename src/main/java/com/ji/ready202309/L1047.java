package com.ji.ready202309;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/15/08:37
 */
public class L1047 {
    public static void main(String[] args) {

    }

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(S.charAt(i));
            } else {
                if (stack.peek() == S.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(S.charAt(i));
                }
            }
        }
        StringBuilder sp = new StringBuilder();
        while (!stack.isEmpty()) {
            sp.append(stack.pop());
        }
        return sp.reverse().toString();
    }
}
