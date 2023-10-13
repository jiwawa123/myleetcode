package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/22:52
 */
public class L141 {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode p = head, q = head.next;
        while (p.next != null && q.next != null) {
            if (p.val == q.val) {
                return true;
            }
            p = p.next;
            q = q.next.next;
        }

        return false;
    }
}
