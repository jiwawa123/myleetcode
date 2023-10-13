package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/06/22:06
 */
public class L206 {
    public static void main(String[] args) {
        ListNode node = new ListNode(10);
        node.next = new ListNode(11);
        reverseList(node);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = null;
        while (head != null) {
            ListNode tmp = head;
            ListNode nr = head.next;
            tmp.next = node;
            node = tmp;
            head = nr;
        }
        return node;
    }
}
