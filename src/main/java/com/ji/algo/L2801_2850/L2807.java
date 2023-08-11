package com.ji.algo.L2801_2850;

import com.ji.algo.Util.ListNode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/11/21:02
 */
public class L2807 {
    public static void main(String[] args) {
        System.out.println(gcc(12, 3));
        System.out.println(gcc(10, 5));

    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode t = head;
        ListNode q = head.next;
        while (t != null && q != null) {
            int k = gcc(t.val, q.val);
            ListNode tmp = new ListNode(k);
            t.next = tmp;
            tmp.next = q;
            t = q.next;
            if (q.next != null) {
                q = q.next.next;
            }
        }

        return head;
    }

    public static int gcc(int a, int b) {
        if (a < b) {
            return gcc(b, a);
        }
        while (b != 0) {
            int a1 = a % b;
            a = b;
            b = a1;
        }
        return a;
    }
}
