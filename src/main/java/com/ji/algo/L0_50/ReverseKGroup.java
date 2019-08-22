package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/22
    time 8:48 AM
*/

import com.ji.algo.Util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(reverseKGroup(head,2).val);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int index = k;
        ListNode res = new ListNode(0);
        ListNode next = res;
        while (index <= list.size()) {
            int tmp = index;
            for (int i = tmp - 1; i >= tmp - k; i++) {
                next.next = new ListNode(list.get(i));
                next = next.next;
            }
            index += k;
        }
        if (index != list.size()) {
            index -= k;
            for (int i = index; i < list.size(); i++) {
                next.next = new ListNode(list.get(i));
                next = next.next;
            }
        }
        return res;

    }
}
