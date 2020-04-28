package com.ji.algo.G0426;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/4/27
 * time 8:26 上午
 */
public class L3 {
    public static void main(String[] args) {

    }

    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> tmp = new LinkedList<>();
        int row = nums.size();
        int maxLen = 0;
        // 每次从第一个点开始遍历 顺便找出最长行的个数
        for (int i = 0; i < row; i++) {
            int r = i, c = 0;
            while (r >= 0) {
                maxLen = Math.max(nums.get(r).size(), maxLen);
                if (nums.get(r).size() > c) {
                    tmp.add(nums.get(r).get(c));
                }
                r--;
                c++;
            }
        }
        // 从最后一个节点
        for (int i = 1; i < maxLen; i++) {
            int c = i, r = row - 1;
            while (r >= 0) {
                if (nums.get(r).size() > c) {
                    tmp.add(nums.get(r).get(c));
                }
                r--;
                c++;
            }
        }


        int res[] = new int[tmp.size()];
        int index = 0;
        for (int k : tmp
        ) {
            res[index++] = k;
        }
        return res;
    }
}
