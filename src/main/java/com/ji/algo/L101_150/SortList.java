package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/3
    time 6:55 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode root = new ListNode(list.get(0));
        ListNode tp = root;
        for (int i = 1; i < list.size(); i++) {
            tp.next = new ListNode(list.get(i));
            tp = tp.next;
        }
        return root;
    }
}
