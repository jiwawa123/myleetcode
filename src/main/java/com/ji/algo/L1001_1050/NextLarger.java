package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/21
    time 7:09 PM
*/

import com.ji.algo.Util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class NextLarger {
    public static void main(String[] args) {

    }
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(j)>list.get(i)){
                    arr[i] = list.get(j);
                    break;
                }
            }
        }
        return arr;
    }
}
