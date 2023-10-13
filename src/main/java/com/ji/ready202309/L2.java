package com.ji.ready202309;

import com.ji.algo.Util.ListNode;
import com.ji.algo.game.G0217.L;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/23:05
 */
public class L2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode pre = node;
        int now = 0;
        while (l1 != null && l2 != null) {
            int sum = (now + (l1.val + l2.val));
            ListNode k = new ListNode(sum % 10);
            now = sum / 10;
            pre.next = k;
            pre = k;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = (now + (l1.val));
            ListNode k = new ListNode(sum % 10);
            now = sum / 10;
            pre.next = k;
            pre = k;
            l1 = l1.next;
        }


        while (l2 != null) {
            int sum = (now + (l2.val));
            ListNode k = new ListNode(sum % 10);
            now = sum / 10;
            pre.next = k;
            pre = k;
            l2 = l2.next;
        }

        if (now > 0) {

            pre.next = new ListNode(now);
        }

        return reverse(node.next);
    }

    public ListNode reverse(ListNode node) {
        while (node == null || node.next == null) {
            return node;
        }

        ListNode res = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = res;
            res = node;
            node = next;
        }

        return res;

    }
}
