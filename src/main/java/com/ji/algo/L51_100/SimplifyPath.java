package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/18
    time 11:08 PM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        if (path == null || path.length() == 0)
            return path;
        path = path.replaceAll("//", "/");
        String tmp[] = path.split("/");
        List<String> stack = new ArrayList<>();
        for (String str : tmp
                ) {
            if (str.equals(".") || str.equals(""))
                continue;
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.remove(stack.size() - 1);
                }
            } else {
                stack.add(str);
            }
        }
        StringBuilder sp = new StringBuilder("/");
        for (int i = 0; i < stack.size(); i++) {
            sp.append(stack.get(i));
            if (i != stack.size() - 1)
                sp.append("/");
        }
        return sp.toString();
    }
}
