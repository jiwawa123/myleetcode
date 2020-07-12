package com.ji.algo.G0628;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/6/28
 * time 9:06 上午
 */
public class L5434 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0};
        System.out.println(longestSubarray(arr));
    }

    public static int longestSubarray(int[] nums) {
        int len = 0;
        int flag = 1;
        List<Integer> list = new LinkedList<>();
        int tmp = 0;
        for (int num : nums
        ) {
            if (num == 1) {
                if (flag == 1) {
                    tmp++;
                } else {
                    list.add(flag * tmp);
                    tmp = 1;
                    flag = 1;
                }
            } else {
                if (flag == -1) {
                    tmp++;
                } else {
                    list.add(flag * tmp);
                    tmp = 1;
                    flag = -1;
                }
            }
        }
        list.add(flag * tmp);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < -1) {
                if (i > 0) {
                    len = Math.max(len, list.get(i - 1));
                }
                if (i < list.size() - 1) {
                    len = Math.max(len, list.get(i + 1));
                }
            }
            if (list.get(i) > 0) {
                len = Math.max(len, list.get(i) - 1);
            }

            if (list.get(i) == -1) {
                if (i > 0 && i < list.size() - 1) {
                    len = Math.max(len, list.get(i - 1) + list.get(i + 1));
                }
            }
        }
        return len;
    }
}
