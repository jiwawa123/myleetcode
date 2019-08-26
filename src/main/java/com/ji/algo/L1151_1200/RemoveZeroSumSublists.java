package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/26
    time 9:46 AM
*/

import com.ji.algo.Util.ListNode;

import java.util.*;

public class RemoveZeroSumSublists {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(4);
        new RemoveZeroSumSublists().removeZeroSumSublists(head);
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null)
            return head;
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        List<Integer> tmp = help(list);
        if (tmp.size() == 0)
            return null;
        ListNode res = new ListNode(0);
        ListNode next = res;
        for (int i = 0; i < tmp.size(); i++) {
            next.next = new ListNode(tmp.get(i));
            next = next.next;
        }
        return res.next;
    }

    public List<Integer> help(List<Integer> list) {
        if (list.size() == 0)
            return list;
        boolean flag = false;
        int arr[] = new int[list.size()];
        arr[0] = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            arr[i] = arr[i - 1] + list.get(i);
        }
        int start = 0, end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                start = map.get(arr[i]) + 1;
                end = i;
                flag = true;
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        if (!flag)
            return list;
        List<Integer> next = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < start || i > end)
                next.add(list.get(i));
        }
        return help(next);
    }
}
