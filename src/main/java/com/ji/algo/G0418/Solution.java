package com.ji.algo.G0418;

import java.util.LinkedList;
public class Solution {

    public ListNode solve(ListNode s) {
        if (s == null || s.next == null)
            return s;
        LinkedList<Integer> tmp = new LinkedList<>();
        while (s != null) {
            tmp.add(s.val);
            s = s.next;
        }
        int start = 0, end = tmp.size() - 1;
        while (start < end) {
            if (isTrue(tmp, end)) {
                tmp = help(tmp, end);
                start = tmp.size() - end;
            } else {
                end--;
            }
        }
        ListNode res = new ListNode(0);
        ListNode next = res;
        for (int i = 0; i < tmp.size(); i++) {
            next.next = new ListNode(tmp.get(i));
            next = next.next;
        }
        return res.next;
    }

    private boolean isTrue(LinkedList<Integer> tmp, int end) {
        int start = 0;
        while (end < tmp.size()) {
            if (tmp.get(start) > tmp.get(end)) {
                return true;
            }
            if (tmp.get(start) < tmp.get(end))
                return false;
            start++;
            end++;
        }
        return true;
    }

    public LinkedList<Integer> help(LinkedList<Integer> tmp, int start) {
        LinkedList<Integer> next = new LinkedList<>();
        for (int i = start; i < tmp.size(); i++) {
            next.add(tmp.get(i));
        }
        for (int i = 0; i < start; i++) {
            next.add(tmp.get(i));
        }
        tmp = next;
        return tmp;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}