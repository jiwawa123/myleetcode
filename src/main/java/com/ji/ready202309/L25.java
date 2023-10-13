package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/29/07:07
 */
public class L25 {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        new L25().reverse(node);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {

            return head;
        }
        int len = 0;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode next = res;
        while (head != null) {
            len++;
            head = head.next;
        }
        head = res.next;
        int group = len / k;
        for (int i = 0; i < group; i++) {
            // 找到分组，然后开始进行转换
            for (int j = 0; j < k - 1; j++) {
                ListNode tmp = head.next;
                head.next = tmp.next;
                tmp.next = next.next;
                next.next = tmp;
            }

            next = head;
            head = next.next;
        }

        return res.next;

    }


    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode pre = null;
        while (node != null) {
            ListNode tmp = node.next;
            node.next = pre;
            pre = node;
            node = tmp;
        }
        return pre;
    }
}
