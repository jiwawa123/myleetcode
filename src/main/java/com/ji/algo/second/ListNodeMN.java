package com.ji.algo.second;

import com.ji.algo.Util.ListNode;

/**
 * user ji
 * data 2020/8/14
 * time 8:24 上午
 */
public class ListNodeMN {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode tmp = reverseII(head, 3, 5);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;

        }

    }

    public ListNode reverseMN(ListNode head, int n, int m) {
        // Empty list
        if (head == null) {
            return null;
        }
        // Move the two pointers until they reach the proper starting point
        // in the list.
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        // The two pointers that will fix the final connections.
        ListNode con = prev, tail = cur;

        // Iteratively reverse the nodes until n becomes 0.
        ListNode third = null;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        // Adjust the final connections as explained in the algorithm
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }


    public static ListNode reverseII(ListNode head, int m, int n) {
        if (head == null)
            return head;
        ListNode cur = head, pre = null;
        while (m > 1) {
            pre = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode con = pre, tail = cur, tmp = null;
        while (n > 0) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            n--;
        }

        if (con != null) {
            con.next = pre;
        } else {
            head = pre;
        }

        tail.next = cur;
        return head;
    }
}
