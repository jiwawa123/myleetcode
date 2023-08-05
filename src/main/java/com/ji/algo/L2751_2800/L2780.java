package com.ji.algo.L2751_2800;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/29/11:13
 */
public class L2780 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(new L2780().minimumIndex(list));
    }

    public int minimumIndex(List<Integer> nums) {
        int len = nums.size();
        int target = getMatch(nums);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums.get(i) == target) {
                count++;
            }
        }
        int now = 0;
        for (int i = 0; i < len; i++) {
            if (nums.get(i) == target) {
                now++;
            }
            int last = count - now;
            if (now * 2 > (i + 1) && last * 2 > (len - i - 1)) {
                return i;
            }
        }
        return -1;
    }

    public int getMatch(List<Integer> nums) {
        int tmp = nums.get(0);
        int len = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (tmp == nums.get(i)) {
                len++;
            } else {
                len--;
                if (len == 0) {
                    tmp = nums.get(i);
                    len = 1;
                }
            }
        }
        return tmp;
    }
}
