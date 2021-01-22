package com.ji.algo.L1701_1750;

import com.ji.algo.Util.ListNode;

/**
 * user ji
 * data 2021/1/22
 * time 8:35 下午
 */
public class L1721 {
    public static void main(String[] args) {

    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode cur = first;
        ListNode last = head;
        while (cur.next != null) {
            cur = cur.next;
            last = last.next;
        }
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        return dummy.next;
    }
}
