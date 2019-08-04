package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/3
    time 7:21 PM
*/

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {4,3,5,1,2};
        System.out.println(validateStackSequences(arr,arr1));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length <= 2)
            return true;
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while (i < popped.length && j < pushed.length) {
            if (pushed[j] != popped[i]) {
                if (!stack.isEmpty() && stack.peek().equals(popped[i])) {
                    stack.pop();
                    i++;
                    continue;
                }
                stack.push(pushed[j]);
                j++;
            } else {
                j++;
                i++;
            }
        }
        while (i < popped.length) {
            if (!stack.isEmpty() && stack.peek().equals(popped[i])) {
                stack.pop();
                i++;
            }else{
                return false;
            }

        }
        return stack.isEmpty();
    }
}
