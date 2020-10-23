package com.ji.algo.L201_250;

import com.ji.algo.Util.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/10/23
 * time 9:03 上午
 */
public class L234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(-129);
        head.next = new ListNode(-129);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (isCycle(head))
            return false;
        List<Integer> res = new LinkedList<>();
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        int i = 0, j = res.size() - 1;
        while (i < j) {
            if (!res.get(i++).toString().equals(res.get(j--).toString()))
                return false;
        }
        return true;
    }

    public static boolean isCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode p = head;
        ListNode q = head.next;
        while (p != null && q != null && q.next != null) {
            if (p == q)
                return true;
            p = p.next;
            q = q.next.next;
        }
        return false;
    }
}
