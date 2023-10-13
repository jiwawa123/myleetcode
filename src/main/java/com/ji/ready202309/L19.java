package com.ji.ready202309;

import com.ji.algo.Util.ListNode;
import com.ji.algo.game.G0217.L;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/22:13
 */
public class L19 {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        new L19().removeNthFromEnd(node, 2);
        ListNode t1 = node;
        System.out.println(node.val);
        System.out.println(t1.val);
        node.val = 1;
        System.out.println(node.val);
        System.out.println(t1.val);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        int index = len - n;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return res.next;
    }
}
