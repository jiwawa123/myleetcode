package com.ji.algo.finalLeetCode;

import com.ji.algo.Util.ListNode;

/**
 * user ji
 * data 2020/7/3
 * time 3:13 下午
 */
public class ListAbout {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        t1.next = new ListNode(2);
        t1.next.next = new ListNode(3);
        t1.next.next.next = new ListNode(4);
        ListNode res = reverseListII(t1);
        System.out.println(res.val);
    }

    // 使用非递归方式实现
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = null;
        while (head != null) {
            // 使用临时变量表示下一个节点的信息
            ListNode tmp = head.next;
            head.next = cur;
            cur = head;
            head = tmp;
        }
        return cur;
    }

    // 使用递归方式实现
    public static ListNode reverseListII(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 这是使用head.next 往后走；
        ListNode next = reverseListII(head.next);
        // 将head接到next.next 后面，同时使next 为空
        head.next.next = head;
        head.next = null;
        return next;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        // 使用非递归的方式进行反转即可
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }
}
