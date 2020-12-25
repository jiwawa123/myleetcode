package com.ji.algo.L1651_1700;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/12/21
 * time 6:58 下午
 */
public class L1694 {
    public static void main(String[] args) {

    }

    public String reformatNumber(String number) {
        number = number.replaceAll("-", "");
        number = number.replaceAll(" ", "");
        int len = number.length();
        int index = 0;
        List<String> list = new LinkedList<>();
        while (len - index > 4) {
            list.add(number.substring(index, index + 3));
            index += 3;
        }
        int tmp = len - index;
        switch (tmp) {
            case 2:
                list.add(number.substring(index, index + 2));
                break;
            case 3:
                list.add(number.substring(index, index + 3));
                break;
            case 4:
                list.add(number.substring(index, index + 2));
                list.add(number.substring(index + 2, index + 4));
                break;
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sp.append(list.get(i));
            if (i != list.size() - 1) {
                sp.append("-");
            }
        }
        return sp.toString();
    }
}
