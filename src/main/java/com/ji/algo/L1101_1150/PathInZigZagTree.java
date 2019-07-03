package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/7/3
    time 9:53 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathInZigZagTree {
    public static void main(String[] args) {
        System.out.println(pathInZigZagTree(1));
    }

    public static List<Integer> pathInZigZagTree(int label) {
        int tmp = 0;
        int level = 1;
        boolean flag = true;
        List<List<Integer>> all = new ArrayList<>();
        while (tmp < label) {
            List<Integer> list = new ArrayList<>();
            for (int i = tmp + 1; i < 2 * level; i++) {
                list.add(i);
            }
            if (flag) {
                all.add(list);
                flag = false;
            } else {
                Collections.reverse(list);
                all.add(list);
                flag = true;
            }
            tmp += list.size();
            level *= 2;
        }
        List<Integer> last = all.get(all.size() - 1);
        int index = 0;
        for (int i = 0; i < last.size(); i++) {
            if (last.get(i) == label) {
                index = i;
                break;
            }
        }

        List<Integer> res = new ArrayList();
        res.add(label);
        if(label<=1)
            return res;
        int len = 1;
        while (last.get(index) != 1 && len < all.size() - 1) {
            len++;
            if (index % 2 == 0)
                index /= 2;
            else
                index = (index - 1) / 2;
            last = all.get(all.size() - len);
            if (last.get(index) == 1)
                break;
            res.add(last.get(index));
        }
        res.add(1);
        Collections.reverse(res);
        return res;
    }

}
