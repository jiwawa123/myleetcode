package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/16:09
 */
public class L21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        while (list1 != null) {
            tmp.next = list1;
            list1 = list1.next;
            tmp = tmp.next;
        }

        while (list2 != null) {
            tmp.next = list2;
            list2 = list2.next;
            tmp = tmp.next;
        }


        return res.next;
    }
}
