package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/2/22
 * time 9:05 下午
 */
public class L1769 {
    public static void main(String[] args) {

    }

    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        int left = 0, right = 0, total = 0; //左边盒子的个数，右边盒子的个数，操作数
        //计算第一个盒子的操作数
        if (boxes.charAt(0) == '1') left ++;
        for (int i = 1 ; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                right++;
                total += i;
            }
        }
        answer[0] = total;
        //根据前一个盒子的操作数，计算下一个盒子的操作数
        for (int i = 1; i < boxes.length(); i++) {
            total = total + left - right;
            if (boxes.charAt(i) == '1') {
                left ++;
                right --;
            }
            answer[i] = total;
        }
        return answer;
    }
}
