package com.ji.algo.L2051_2100;

import com.ji.algo.Util.ListNode;

import java.util.List;

/**
 * @author ji
 * @data 2021/12/12
 * @time 8:38 上午
 */
public class L2058 {
    public static void main(String[] args) {

    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {Integer.MAX_VALUE, -1};
        if (head == null || head.next == null || head.next.next == null){
            arr[0]=-1;
            return arr;
        }

        int first = Integer.MAX_VALUE, last = -1, len = 1;
        ListNode p = head.next;
        while (p != null && p.next != null) {
            if ((p.val < head.val && p.val > p.next.val) ||
                    (p.val > head.val && p.val < p.next.val)) {
                first = Math.min(first, len);
                if (last != -1) {
                    arr[0] = Math.min(arr[0], len - last);
                }
                last = len;
            }
            p = p.next;
            head = head.next;
            len++;
        }

        if (arr[0]==Integer.MAX_VALUE)
            arr[0] = -1;
        if(first!=last){
            arr[1] = last -first;
        }
        return arr;
    }
}
