package com.ji.algo.L51_100;

import java.util.Stack;

/**
 * user ji
 * data 2021/1/27
 * time 5:06 下午
 */
public class L84 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2};
        System.out.println(largestRectangleArea(arr));
    }

    // 单调栈的使用
    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        int len = heights.length;
        int arr[] = new int[len + 2];
        for (int i = 1; i < heights.length + 1; i++) {
            arr[i] = heights[i - 1];
        }
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(index++);
        while (index < len + 2) {
            if (arr[stack.peek()] <= arr[index]) {
                stack.push(index++);
                continue;
            }

            while (arr[stack.peek()] > arr[index]) {
                int tmp = stack.pop();
                res = Math.max(res, (index - 1 - stack.peek())* (arr[tmp]));
            }

            stack.push(index++);
        }

        return res;
    }
}
