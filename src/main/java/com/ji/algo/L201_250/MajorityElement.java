package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 10:35 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {

    }

    //摩尔表决法的变形
    public List<Integer> majorityElement(int[] nums) {
        //定义两个变量来指定存在的最多两个数
        int x = 0, y = 0, cx = 0, cy = 0, count = 0;
        for (int num : nums) {
            if ((cx == 0 || num == x) && num != y) {
                ++cx;
                x = num;
            } else if (cy == 0 || num == y) {
                ++cy;
                y = num;
            } else {
                --cx;
                --cy;
            }
        }
        for (int num : nums) {
            if (x == num) {
                ++count;
            }
        }
        List<Integer> res = new ArrayList<>();
        if (count > nums.length / 3) {
            res.add(x);
        }
        count = 0;
        for (int num : nums) {
            if (y == num) {
                ++count;
            }
        }
        if (count > nums.length / 3 && x != y) {
            res.add(y);
        }
        return res;
    }
}
