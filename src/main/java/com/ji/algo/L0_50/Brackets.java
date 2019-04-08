package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 2:10 PM
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {

    }

    //通过栈的特性，直接遍历即可
    public boolean isValid(String s) {
        if (null == s || s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                if (stack.peek() == map.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
