package com.ji.algo.G1019;

import java.util.Stack;

/**
 * user ji
 * data 2020/10/19
 * time 10:18 上午
 */
public class L844 {
    public static void main(String[] args) {

    }

    public boolean backspaceCompare(String S, String T) {
        return deal(S).equals(deal(T));
    }

    public String deal(String s) {
        Stack<Character> tmp = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!tmp.isEmpty())
                    tmp.pop();
            } else {
                tmp.push(s.charAt(i));
            }

        }
        StringBuilder sp = new StringBuilder();
        while (!tmp.isEmpty())
            sp.append(tmp.pop());
        return sp.reverse().toString();
    }
}
