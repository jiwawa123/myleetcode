package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 8:41 AM
*/

import java.util.Stack;

public class LargestRectangleArea {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        largestRectangleAreaII(arr);
    }
    public int largestRectangleArea(int[] array) {
        int max = 0;
        if(array==null||array.length==0)
            return max;
        for (int i = 0; i < array.length; i++) {
            int len = 1;
            for (int j = i-1; j >0 ; j--) {
                if(array[j]>=array[i])
                    len++;
                else
                    break;
            }
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]>array[i])
                    len++;
                else
                    break;
            }
            max = Math.max(len*array[i],max);
        }
        return max;
    }
    public static int largestRectangleAreaII(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            //判断i是否达到右边界，影响后面的到达右边界的stack弹出，计算逻辑
            int curHeight = i == n ? -1 : heights[i];
            //维持一个单调栈，从栈底到栈顶是从小到大的顺序，如果要进栈的元素比栈顶的值小，将栈顶的值弹出，计算逻辑
            while (!stack.isEmpty() && curHeight <= heights[stack.peek()]) {
                int stackHeight = heights[stack.pop()];
                // i - stack.peek() - 1 是计算width，这个code需要扣一下
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, stackHeight * width);
            }
            stack.push(i);
        }
        return max;
    }
}
