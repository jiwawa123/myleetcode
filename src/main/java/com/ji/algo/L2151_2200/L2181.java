package com.ji.algo.L2151_2200;

import com.ji.algo.Util.ListNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/25/08:44
 */
public class L2181 {
    public static void main(String[] args) {

    }

    public ListNode mergeNodes(ListNode head) {
        ListNode l = new ListNode(0);
        ListNode t = new ListNode(0);
        l.next = t;
        int sum = 0;
        while (head != null) {
            if (head.val != 0) {
                sum += head.val;
            } else {
                ListNode n = new ListNode(sum);
                t.next = n;
                t = n;
                sum = 0;
            }
            head = head.next;
        }
        return l.next.next;
    }
}
