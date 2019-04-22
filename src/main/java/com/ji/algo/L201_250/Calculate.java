package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/22
    time 7:44 AM
*/

import java.util.Stack;

public class Calculate {
    public static void main(String[] args) {
        System.out.println(calculate("1-1+1"));
    }

    public static int calculate(String s) {
        Stack<Long> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        s = s.replaceAll(" ", "");
        int i = 0;
        String tmp = "";
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                tmp += s.charAt(i);
                i++;
                continue;
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                stack.push(Long.valueOf(tmp));
                tmp = "";
                stack1.push(s.charAt(i)=='+'?'+':'-');
                i++;

                continue;
            }
            if (s.charAt(i) == '*' || s.charAt(i) == '/') {
                stack.push(Long.valueOf(tmp));
                tmp = "";
                char t = s.charAt(i);
                i++;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    tmp += s.charAt(i++);
                }
                long a = stack.pop();
                int b = Integer.valueOf(tmp);
                if (t == '*') {
                    stack.push(a * b);
                } else {
                    stack.push(a / b);
                }
                tmp = "";
            }
            i++;
        }
        if (!tmp.equals("")) {
            stack.push(Long.valueOf(tmp));
        }
        while (!stack1.isEmpty()) {
            char d = stack1.pop();
            long a = stack.pop();
            long b = stack.pop();
            if (d == '+') {
                stack.push(a + b);
            } else {
                stack.push(b - a);
            }
        }
        return (int)(long)stack.pop();
    }
}
