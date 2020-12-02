package com.ji.tx1125;

import com.ji.algo.Util.ListNode;
import com.ji.algo.game.G0217.L;

import java.util.Scanner;

/**
 * user ji
 * data 2020/11/25
 * time 5:04 下午
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        ListNode node = new ListNode(0);
        ListNode tmp = node;
        for (int i = 0; i < len; i++) {
            tmp.next = new ListNode(sc.nextInt());
            tmp = tmp.next;
        }
        ListNode res = removeKth(node.next, k);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public static ListNode removeKth(ListNode head, int k) {
        if (k <= 0 || head == null)
            return head;
        ListNode tmp = head;
        while (k > 2 && tmp != null) {
            tmp = tmp.next;
            k--;
        }
        if (tmp == null)
            return head;
        tmp.next = tmp.next.next;
        return head;
    }
}
