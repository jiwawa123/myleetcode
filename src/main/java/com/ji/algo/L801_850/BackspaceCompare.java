package com.ji.algo.L801_850;/*
    user ji
    data 2019/6/2
    time 6:34 PM
*/

import java.util.Stack;

public class BackspaceCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (!stack1.isEmpty())
                    stack1.pop();
            } else {
                stack1.push(T.charAt(i));
            }
        }
        while (!stack.isEmpty() && !stack1.isEmpty()) {
            if (stack.pop() != stack1.pop())
                return false;
        }
        return stack1.isEmpty() && stack.isEmpty();
    }
}
