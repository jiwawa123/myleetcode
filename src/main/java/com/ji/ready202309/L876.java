package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/13/08:50
 */
public class L876 {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head, q = head.next;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        if (q == null) {
            return p;
        }
        return q.next;
    }
}
