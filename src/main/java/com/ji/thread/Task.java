package com.ji.thread;/*
    user ji
    data 2019/5/9
    time 8:45 AM
*/

import java.util.List;

public class Task {
    public static boolean flag;

    public static void doSomething(List<Integer> list) {
        if (flag)
            return;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3000) {
                flag = true;
                break;
            }
        }
        return;
    }
}
