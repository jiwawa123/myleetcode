package com.ji.algo.L2351_2400;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/30/上午8:45
 */
public class L2390 {
    public static void main(String[] args) {

    }

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.add(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
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
