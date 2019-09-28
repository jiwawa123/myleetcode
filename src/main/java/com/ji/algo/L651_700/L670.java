package com.ji.algo.L651_700;/*
    user ji
    data 2019/9/28
    time 11:10 AM
*/

import java.util.Arrays;

public class L670 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(22341345));
    }


    public static int maximumSwap(int num) {
        //1.排序数组元素
        char[] orderNum = Integer.toString(num).toCharArray();
        char[] oldNum = Integer.toString(num).toCharArray();
        Arrays.sort(orderNum);//这里是从小到大排列

        int diff = -1;
        //2.比较第一个不同的元素
        for (int i = 0; i < orderNum.length; i++) {
            if (oldNum[i] != orderNum[orderNum.length - 1 - i]) {
                diff = i;
                break;
            }
        }

        //两数相同，不需要交换
        if (diff == -1) return num;

        //两两交换
        for (int i = oldNum.length - 1; i >= diff; i--) {
            if (oldNum[i] == orderNum[orderNum.length - 1 - diff]) {
                //交换后直接跳出
                swap(oldNum, diff, i);
                break;
            }
        }

        return Integer.parseInt(new String(oldNum));
    }

    private static void swap(char[] chars, int lo, int hi) {
        char tmp = chars[lo];
        chars[lo] = chars[hi];
        chars[hi] = tmp;
    }
}
