package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/10
    time 2:28 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.Stack;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        else {
            ListNode next = head.next;
            head.next = null;
            ListNode returnValue = reverseList(next);
            next.next = head;
            return returnValue;
        }
    }

    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
    }
}
