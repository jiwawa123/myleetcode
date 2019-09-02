package com.ji.algo.L401_450;/*
    user ji
    data 2019/9/2
    time 5:47 PM
*/

import java.util.ArrayList;
import java.util.List;

public class ValidWordSquare {
    public static void main(String[] args) {

    }

    public boolean isSquare(List<String> list) {
        List<StringBuilder> sp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            sp.add(new StringBuilder());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                sp.get(i).append(list.get(i).charAt(j));
            }
        }
        for (int i = 0; i < sp.size(); i++) {
            if (!sp.get(i).toString().equals(list.get(i)))
                return false;
        }
        return true;
    }
}
