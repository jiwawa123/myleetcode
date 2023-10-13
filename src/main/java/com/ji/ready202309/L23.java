package com.ji.ready202309;

import com.ji.algo.Util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/22/19:53
 */
public class L23 {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1 > o2) {
                return 1;
            }
            return 0;
        });
        queue.add(1);
        queue.add(2);
        queue.add(3);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = new ListNode(0);
        ListNode next = node;
        Queue<ListNode> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.val > o2.val) {
                return 1;
            }
            return 0;
        });

        for (ListNode l : lists
        ) {
            if (l != null) {
                queue.add(l);
            }

        }


        while (!queue.isEmpty()) {
            ListNode t = queue.poll();

            if (t.next != null) {
                queue.add(t.next);
            }
            t.next = null;
            next.next = t;
            next = next.next;
        }
        return node.next;
    }
}
