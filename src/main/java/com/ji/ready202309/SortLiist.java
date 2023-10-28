package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/13/08:50
 */
public class SortLiist {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode res = new ListNode(0);
        ListNode next = res;
        while (left != null && right != null) {
            if (left.val > right.val) {
                next.next = right;
                right = right.next;

            } else {
                next.next = left;
                left = left.next;
            }
            next = next.next;
        }

        while (left != null) {
            next.next = left;
            left = left.next;
            next = next.next;
        }

        while (right != null) {
            next.next = right;
            right = right.next;
            next = next.next;
        }

        return res.next;

    }
}
