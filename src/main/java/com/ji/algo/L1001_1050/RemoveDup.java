package com.ji.algo.L1001_1050;
/*
 *  user ji
 *  data 2019/5/28
 *  time 8:25 AM
 */

import java.util.Stack;

public class RemoveDup {
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
