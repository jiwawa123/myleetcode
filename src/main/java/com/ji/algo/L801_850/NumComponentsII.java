package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/11
    time 6:29 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.HashMap;
import java.util.Map;

public class NumComponentsII {
    public static void main(String[] args) {

    }

    public int numComponents(ListNode head, int[] G) {
        if (head == null)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < G.length; i++) {
            map.put(G[i], 0);
        }
        int count = 0;
        boolean flag = false;
        while (head != null) {
            if (map.containsKey(head.val)) {
                if (!flag) {
                    count += 1;
                    flag = true;
                }
            } else {
                flag = false;
            }
            head = head.next;
        }
        return count;
    }
}
