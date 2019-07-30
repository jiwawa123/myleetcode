package com.ji.algo.L451_500;/*
    user ji
    data 2019/7/30
    time 9:07 AM
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LFUCache {
    private Map<Integer, ListNode> map;//存储key对应的value所在的节点
    private Map<Integer, ListNode> tailMap;//存储每个区间的最左边
    private final int capacity;
    private ListNode head;//链表最右边

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.tailMap = new HashMap<>();
        head = new ListNode();
        head.left = new ListNode();
        head.left.right = head;
        tailMap.put(0, head.left);
    }

    public int get(int key) {
        if (capacity <= 0 || !map.containsKey(key)) return -1;
        ListNode cur = map.get(key);
        use(cur);
        return cur.val;
    }

    //使用节点，移动该节点在链表的位置
    private void use(ListNode cur) {
        cur.cnt++;
        if (cur.left != null) cur.left.right = cur.right;
        if (cur.right != null) cur.right.left = cur.left;
        if (!tailMap.containsKey(cur.cnt)) {
            ListNode node = new ListNode();
            node.right = tailMap.get(cur.cnt - 1);
            node.right.left = node;
            tailMap.put(cur.cnt, node);
        }
        ListNode tail = tailMap.get(cur.cnt);
        cur.left = tail;
        cur.right = tail.right;
        cur.right.left = cur;
        tail.right = cur;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        ListNode node = map.getOrDefault(key, null);
        if (node != null) {
            node.val = value;
            use(node);
            return;
        }
        if (map.size() == capacity) removeFirslt();
        node = new ListNode(value, key);
        ListNode tail = tailMap.get(node.cnt);
        node.left = tail;
        node.right = tail.right;
        node.right.left = node;
        tail.right = node;
        map.put(key, node);
    }

    //移除最不常用的节点
    private void removeFirslt() {
        ListNode cur = head;
        while (cur.val == -1) {
            cur = cur.left;
        }
        cur.left.right = cur.right;
        cur.right.left = cur.left;
        map.remove(cur.key);
    }

    //一个简单的链表
    private class ListNode {
        int val, cnt, key;//cnt代表使用次数
        ListNode left, right;

        public ListNode() {
            this.val = -1;
        }

        public ListNode(int val, int key) {
            this.val = val;
            this.key = key;
            cnt = 0;
        }
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(2, 1);
        lfuCache.put(3, 2);
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(2));
        lfuCache.put(4, 3);
        System.out.println(lfuCache.get(2));
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(4));
    }
}
