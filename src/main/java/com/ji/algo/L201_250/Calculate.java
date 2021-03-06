package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/22
    time 7:44 AM
*/

import java.util.ArrayList;
import java.util.List;
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
                if(!tmp.equals("")){
                    stack.push(Long.valueOf(tmp));
                    tmp = "";
                }
                stack1.push(s.charAt(i)=='+'?'+':'-');
                i++;

                continue;
            }
            if (s.charAt(i) == '*' || s.charAt(i) == '/') {
                if(!tmp.equals("")){
                    stack.push(Long.valueOf(tmp));
                    tmp = "";
                }
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
        }
        if (!tmp.equals("")) {
            stack.push(Long.valueOf(tmp));
        }
        StringBuffer sp = new StringBuffer();
        while(!stack1.isEmpty()){
            sp.append(stack1.pop());
        }
        sp = sp.reverse();
        List<Long> ll = new ArrayList();
        while(!stack.isEmpty()){
            ll.add(stack.pop());
        }
        long re = ll.get(ll.size()-1);
        int index = ll.size() -2;
        int j = 0;
        while(j<sp.length()){
            if(sp.charAt(j)=='+'){
                re+=ll.get(index--);
            }else{
                re-=ll.get(index--);
            }
            j++;
        }
        return (int)re;
    }
}
