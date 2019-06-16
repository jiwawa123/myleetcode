package com.ji.algo.L851_900;/*
    user ji
    data 2019/6/16
    time 8:30 PM
*/

import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("()()"));
    }

    public static int scoreOfParentheses(String S) {
        Stack<String> stack = new Stack<>();
        char[] tmp = S.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            switch (tmp[i]) {
                case '(':
                    stack.push("" + '(');
                    break;
                case ')':
                    String t = stack.pop();
                    if (t.equals("(")) {
                        stack.push(1 + "");
                        break;
                    } else {
                        int tt = Integer.valueOf(t);
                        int ttt = 0;
                        while (!stack.isEmpty() && !stack.peek().equals("(")) {
                            ttt += Integer.valueOf(stack.pop());
                        }
                        stack.pop();
                        stack.push((tt + ttt) * 2 + "");
                        break;
                    }
            }
        }
        int count = 0;
        while (!stack.isEmpty()) {
            count += Integer.valueOf(stack.pop());
        }
        return count;
    }

}
