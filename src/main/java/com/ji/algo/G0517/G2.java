package com.ji.algo.G0517;

import java.util.Arrays;
import java.util.Comparator;

/**
 * user ji
 * data 2020/5/17
 * time 4:19 下午
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println((char) ('a' - 32));
    }

    public String arrangeWords(String text) {
        String[] textArr = text.split(" ");
        Arrays.sort(textArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < textArr.length; i++) {
            if (i != 0)
                sp.append(" ");
            char tmp[] = textArr[i].toCharArray();
            if (i == 0) {
                if (tmp[0] > 'Z') {
                    tmp[0] -= 32;
                }
            } else {
                if (tmp[0] >= 'A'&&tmp[0]<='Z') {
                    tmp[0] += 32;
                }
            }
            sp.append(String.valueOf(tmp));
        }

        return sp.toString();
    }
}
