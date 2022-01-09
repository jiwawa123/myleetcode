package com.ji.algo.L2101_2150;

import com.ji.algo.Util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/09/下午8:55
 */
public class L5961 {
    public static void main(String[] args) {

    }

    public int pairSum(ListNode head) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            res = Math.max(res, list.get(i) + list.get(list.size() - i - 1));
        }
        return res;
    }
}
