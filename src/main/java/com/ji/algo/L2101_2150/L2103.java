package com.ji.algo.L2101_2150;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ji
 * @data 2021/12/13
 * @time 11:22 下午
 */
public class L2103 {
    public static void main(String[] args) {

    }

    public int countPoints(String rings) {
        int res = 0;
        Set<Character>[] set = new HashSet[10];
        for (int i = 0; i < 10; i++)
            set[i] = new HashSet();
        Set<Character> tmp = new HashSet();
        for (char a : rings.toCharArray()) {

            switch (a) {
                case 'R':
                    tmp.add('R');
                    break;
                case 'G':
                    tmp.add('G');
                    break;
                case 'B':
                    tmp.add('B');
                    break;
                default:
                    set[a - '0'].addAll(tmp);
                    if (set[a - '0'].size() > 2)
                        res++;
                    tmp = new HashSet();
                    break;
            }
        }
        return res;
    }
}
