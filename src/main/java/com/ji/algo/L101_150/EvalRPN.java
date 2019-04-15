package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 9:05 PM
*/

import java.util.Stack;

public class EvalRPN {
    public static void main(String[] args) {

    }

    public int evalRPN(String[] tokens) {
        if (null == tokens || tokens.length == 0)
            return 0;
        Stack<Integer> stack = new Stack();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    int a1 = stack.pop();
                    int b1 = stack.pop();
                    stack.push(a1 - b1);
                    break;
                case "*":
                    int a2 = stack.pop();
                    int b2 = stack.pop();
                    stack.push(a2*b2);
                    break;
                case "/":
                    int a3 = stack.pop();
                    int b3 = stack.pop();
                    stack.push(a3*b3);
                    break;
                default:
                    stack.push(Integer.valueOf(tokens[i]));
                    break;
            }
        }
        return stack.pop();

    }
}
