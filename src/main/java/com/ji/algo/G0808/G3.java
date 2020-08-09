package com.ji.algo.G0808;

import java.util.Stack;

/**
 * user ji
 * data 2020/8/8
 * time 11:05 下午
 */
public class G3 {
    public static void main(String[] args) {
        System.out.println(minInsertions(")))())()()())()((()((()((())))()(("));
    }

    public static int minInsertions(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (tmp == 0) {
                    stack.push(1);
                    continue;
                }
                if (tmp == 1) {
                    if (stack.isEmpty()) {
                        res += 2;
                    } else {
                        stack.pop();
                        res += 1;
                    }
                    tmp = 0;
                }
                stack.push(1);
            } else {
                tmp++;
                if (tmp == 2) {
                    if (stack.isEmpty()) {
                        res += 1;
                    } else {
                        stack.pop();
                    }
                    tmp = 0;
                }
            }
        }

        while (!stack.isEmpty()) {
            if (tmp == 0)
                res += 2;
            else {
                res += 2 - tmp;
                tmp = 0;
            }
            stack.pop();
        }

        if (tmp == 1) {
            res += 2;
        }
        return res;
    }
}
