package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/5
    time 8:44 AM
*/

import java.util.Stack;

public class CheckValidString {
    public static void main(String[] args) {
        System.out.println(checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
    }

    public static boolean checkValidString(String s) {
        Stack<Character> statck = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '*':
                    count++;
                    break;
                case '(':
                    statck.push('(');
                    break;
                case ')':
                    if (!statck.isEmpty()) {
                        statck.pop();
                        break;
                    }
                    if (count > 0) {
                        count--;
                        break;
                    }
                    return false;
            }
        }
        while (!statck.isEmpty()) {
            if (count > 0) {
                statck.pop();
                count--;
            } else {
                return false;
            }
        }
         statck = new Stack<>();
         count = 0;
        for (int i = s.length()-1; i >=0; i--) {
            switch (s.charAt(i)) {
                case '*':
                    count++;
                    break;
                case ')':
                    statck.push(')');
                    break;
                case '(':
                    if (!statck.isEmpty()) {
                        statck.pop();
                        break;
                    }
                    if (count > 0) {
                        count--;
                        break;
                    }
                    return false;
            }
        }
        while (!statck.isEmpty()) {
            if (count > 0) {
                statck.pop();
                count--;
            } else {
                return false;
            }
        }

        return true;
    }
}
