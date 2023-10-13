package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/14/23:25
 */
public class L83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(-200);
        res.next = head;
        ListNode tmp = res;
        while (tmp != null) {
            ListNode next = tmp.next;
            int k = tmp.val;
            while (next != null && next.val == k) {
                next = next.next;
            }
            tmp.next = next;
            tmp = tmp.next;
        }
        return res.next;
    }
}
