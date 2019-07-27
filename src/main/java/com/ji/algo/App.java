package com.ji.algo;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int arr[] = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(arr, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target - nums[i])
                    return target;
                if (nums[start] + nums[end] < target - nums[i]) {

                    if (min < Math.abs(target - nums[i] - nums[start] - nums[end])) {
                        min = Math.abs(target - nums[i] - nums[start] - nums[end]);
                        max = nums[i] + nums[start] + nums[end];
                    }
                    start++;
                } else {

                    if (min < Math.abs(target - nums[i] - nums[start] - nums[end])) {
                        min = Math.abs(target - nums[i] - nums[start] - nums[end]);
                        max = nums[i] + nums[start] + nums[end];
                    }
                    end--;
                }

            }
        }
        return max;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String str : tokens) {
            switch (str) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    int a1 = stack.pop();
                    int b1 = stack.pop();
                    stack.push(b1 - a1);
                    break;
                case "*":
                    int a2 = stack.pop();
                    int b2 = stack.pop();
                    stack.push(b2 * a2);
                    break;
                case "/":
                    int a3 = stack.pop();
                    int b3 = stack.pop();
                    stack.push(b3 / a3);
                    break;
                default:
                    stack.push(Integer.valueOf(str));
                    break;
            }
        }
        return stack.pop();
    }
}
