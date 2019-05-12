package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/12
    time 9:59 PM
*/

import java.util.ArrayList;
import java.util.List;

public class BallPoint {
    public static void main(String[] args) {
        String arr[] = {"5", "2", "C", "D", "+"};
        calPoints(arr);
    }

    public static int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        List<Boolean> bool = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    int tmp = 0;
                    int cou = 0;
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (bool.get(j)) {
                            tmp++;
                            cou += list.get(j);
                        }
                        if (tmp >= 2)
                            break;
                    }
                    list.add(cou);
                    bool.add(true);
                    break;
                case "D":
                    int k = 0;
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (bool.get(j)) {
                            k = list.get(j)*2;
                            break;
                        }
                    }
                    list.add(k);
                    bool.add(true);
                    break;
                case "C":
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (bool.get(j)) {
                            bool.set(j, false);
                            break;
                        }
                    }
                    break;
                default:
                    list.add(Integer.valueOf(ops[i]));
                    bool.add(true);
                    break;

            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (bool.get(i))
                count += list.get(i);
        }
        return count;
    }
}
