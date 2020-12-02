package com.ji.algo.G1130;

import com.ji.algo.Util.ListNode;

/**
 * user ji
 * data 2020/11/30
 * time 8:57 下午
 */
public class G2 {
    public static void main(String[] args) {

    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode res = list1;
        ListNode res1 = list2;
        while (a > 0) {
            res = res.next;
            a--;
        }
        ListNode tp = res.next;
        res.next = list2;
        while (b > 0) {
            tp = tp.next;
            b--;
        }
        while (res1.next != null) {
            res1 = res1.next;
        }
        res1.next = tp;
        return list1;
    }
}
