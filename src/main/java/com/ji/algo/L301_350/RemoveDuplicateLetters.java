package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/15
    time 5:46 PM
*/

import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    public static String removeDuplicateLetters(String s) {
        if (s == null || s.length() < 2)
            return s;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.contains(s.charAt(i))) {
                continue;
            }
            if (stack.peek() < s.charAt(i)) {
                stack.push(s.charAt(i));
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > s.charAt(i) && s.substring(i, s.length()).indexOf(stack.peek()) != -1) {
                stack.pop();
            }
            stack.push(s.charAt(i));

        }
        StringBuilder sp = new StringBuilder();
        while (!stack.isEmpty()) {
            sp.append(stack.pop());
        }
        return sp.reverse().toString();
    }
}
