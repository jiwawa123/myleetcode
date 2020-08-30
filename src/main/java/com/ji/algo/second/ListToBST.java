package com.ji.algo.second;

import com.ji.algo.Util.ListNode;
import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/8/18
 * time 7:36 上午
 */
public class ListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return sortedListToBST(list, 0, list.size() - 1);
    }

    public TreeNode sortedListToBST(List<Integer> list, int start, int end) {
        if (start > end)
            return null;
        if (list.size() == 0)
            return null;
        int index = (end - start) / 2 + start;
        TreeNode tmp = new TreeNode(list.get(index));
        tmp.left = sortedListToBST(list, start, index - 1);
        tmp.right = sortedListToBST(list, index + 1, end);
        return tmp;
    }
}
