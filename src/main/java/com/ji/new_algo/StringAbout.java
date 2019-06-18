package com.ji.new_algo;/*
    user ji
    data 2019/6/8
    time 9:59 AM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringAbout {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        if (s == null || s.length() == 0)
            return 0;
        String tmp = "";
        int i = 0;
        while (i < s.length()) {
            int index = tmp.indexOf(s.charAt(i));
            if (index == -1) {
                tmp += s.charAt(i);
                len = Math.max(tmp.length(), len);
            } else {
                tmp = tmp.substring(index + 1, tmp.length());
                tmp += s.charAt(i);
            }
            i++;
        }
        return len;
    }

    public boolean isValid(String s) {
        if (null == s || s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('[');
                    break;
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;
                    if (stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty())
                        return false;
                    if (stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty())
                        return false;
                    if (stack.pop() != '[')
                        return false;
                    break;
            }
            i++;
        }
        return stack.isEmpty();
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        help(result, 0, 0, "", n);
        return result;
    }

    public static void help(List<String> res, int left, int right, String tmp, int n) {
        if (right > left || left > n)
            return;
        if (left == right && left == n) {
            res.add(tmp);
            return;
        }
        help(res, left + 1, right, tmp + "(", n);
        help(res, left, right + 1, tmp + ")", n);
    }

    public int titleToNumber(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count+=(s.charAt(i)-'A'+1)*(Math.pow(26,s.length() - i-1));
        }
        return count;
    }
}
