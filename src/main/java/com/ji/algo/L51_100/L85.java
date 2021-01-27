package com.ji.algo.L51_100;

import java.util.Stack;

/**
 * user ji
 * data 2021/1/27
 * time 5:49 下午
 */
public class L85 {
    public static void main(String[] args) {

    }

    public static int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[row][col + 2];
        int res = 0;
        for (int i = 1; i < col + 1; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[j][i - 1] == '0')
                    continue;
                arr[j][i] = 1;
                if (j > 0) {
                    arr[j][i] += arr[j - 1][i];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            res = Math.max(res, largestRectangleArea(arr[i]));
        }

        return res;
    }


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
                res = Math.max(res, (index - 1 - stack.peek()) * (arr[tmp]));
            }

            stack.push(index++);
        }

        return res;
    }

}
