package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/15
    time 5:28 PM
*/

import com.ji.algo.Util.ListNode;

public class DeleteDuplicatesIII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        ListNode tmp = deleteDuplicates(head);
        System.out.println(tmp.val);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode res = new ListNode(0);
        ListNode next = res;
        int tmp = Integer.MAX_VALUE;
        int last = Integer.MAX_VALUE;
        while (head.next != null) {
            if (head.val != last && head.val != head.next.val) {
                next.next = new ListNode(head.val);
                next = next.next;
            }
            last = head.val;
            head = head.next;
        }
        if (head.val != last) {
            next.next = new ListNode(head.val);
        }
        return res.next;
    }
}
