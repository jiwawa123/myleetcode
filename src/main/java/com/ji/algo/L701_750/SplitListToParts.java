package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/4
    time 7:37 AM
*/

import com.ji.algo.Util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SplitListToParts {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        splitListToParts(listNode, 5);
    }

    public static ListNode[] splitListToParts(ListNode root, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode arr[] = new ListNode[k];
        while (root != null) {
            list.add(root.val);
            root = root.next;
        }
        if (list.size() <= k) {
            for (int i = 0; i < list.size(); i++) {
                arr[i] = new ListNode(list.get(i));
            }
            return arr;
        }
        int len = list.size() / k;
        int i = 0, index = 0;
        while (i < k && index < list.size()) {
            if ((k - i) * len == (list.size() - index)) {
                ListNode tmp = new ListNode(list.get(index));
                ListNode next = tmp;
                for (int j = index + 1; j < index + len; j++) {
                    next.next = new ListNode(list.get(j));
                    next = next.next;
                }
                index += len;
                arr[i++] = tmp;
            } else {
                ListNode tmp = new ListNode(list.get(index));
                ListNode next = tmp;
                for (int j = index + 1; j < index + len + 1; j++) {
                    next.next = new ListNode(list.get(j));
                    next = next.next;
                }
                index += len + 1;
                arr[i++] = tmp;
            }
        }
        return arr;
    }
}
