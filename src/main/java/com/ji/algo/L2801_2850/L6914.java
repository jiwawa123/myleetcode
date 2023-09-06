package com.ji.algo.L2801_2850;

import com.ji.algo.Util.ListNode;
import com.ji.algo.game.G0217.L;

import java.math.BigInteger;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/13/12:27
 */
public class L6914 {
    public static void main(String[] args) {

    }

    public ListNode doubleIt(ListNode head) {
        StringBuilder sp = new StringBuilder();
        while (head != null) {
            sp.append(head.val);
            head = head.next;
        }
        BigInteger bigInteger = new BigInteger(sp.toString());
        BigInteger bigInteger1 = bigInteger.add(bigInteger);
        ListNode tmp = new ListNode(0);
        ListNode t = tmp;
        String s = bigInteger1.toString();
        for (int i = 0; i < s.length(); i++) {
            t.next = new ListNode(s.charAt(i) - '0');
            t = t.next;
        }
        return tmp.next;
    }
}
