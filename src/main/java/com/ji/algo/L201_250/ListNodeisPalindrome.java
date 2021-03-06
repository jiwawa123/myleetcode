package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 10:45 PM
*/

import com.ji.algo.Util.ListNode;

public class ListNodeisPalindrome {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = l1;
        for (int i = 2; i < 4; i++) {
            l2.next = new ListNode(i);
            l2 = l2.next;
        }
        reverse(l1);
    }

    /*
    思路：
    先找到中间节点；
    逆序后面的节点；
    开始一次比较
     */
    public boolean isPalindrome(ListNode head) {
        // 要实现 O(n) 的时间复杂度和 O(1) 的空间复杂度，需要翻转后半部分
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 根据快慢指针，找到链表的中点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        // 递归到最后一个节点，返回新的新的头结点
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
