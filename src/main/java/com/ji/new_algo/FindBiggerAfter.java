package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 8:38 AM
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class FindBiggerAfter {
    public int[] solution(int[] input) {
        if (null == input || 0 == input.length) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        int bottom = 0; // 初始化栈底指针
        int[] result = new int[input.length];// 记录搜索结果

        for (int i = 0; i < input.length; i++) {
            //1. 栈空
            if (stack.isEmpty()) {
                bottom = i;
                stack.push(i);
                continue;
            }
            // 栈底是栈中最大元素
            // 假设栈中是  3  1
            // 输入是  2     3>2  入栈  ,但是2大于栈顶的1  ,也就是说 2 是1 后面第一个比他大的数
            //   这是应该将1弹出,2压入
            // 栈:  3 2
            // 输入  4          3<4  弹栈(清空栈)  4入栈
            // 栈:  4

            //2. 栈底元素大于等于输入
            if (input[bottom] >= input[i]) {
                // 需要判断栈顶是否也是比新元素大
                // 栈顶较小,说明新元素是栈顶元素的后面的第一个比他大的元素
                if (input[stack.peek()] < input[i]) {
                    result[stack.pop()] = input[i];
                }
                // 这里保证了 栈中元素是: 栈底->栈顶 是由大到小的顺序
                if (stack.isEmpty()) {
                    bottom = i;// 更新栈底指针
                }
                stack.push(i);
                continue;
            }

            //3. 输入元素大于栈底,那么全部弹栈
            while (!stack.isEmpty()) {
                result[stack.pop()] = input[i];
            }
            bottom = i;
            stack.push(i);

        }
        // 4 .处理没找到之后的比他大的位置,此时索引应该还在栈中
        while (!stack.isEmpty()) {
            result[stack.pop()] = Integer.MIN_VALUE;
        }
        return result;

    }

    public static int[] findNextBigger(int arr[]) {
        int res[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        int bottom = 0;
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                bottom = i;
                continue;
            }
            if (arr[bottom] >= arr[i]) {
                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                    res[stack.pop()] = i;
                }
                stack.push(i);
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                    res[stack.pop()] = i;
                }
                if (stack.isEmpty()) {
                    stack.push(i);
                    bottom = i;
                }
            }
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = Integer.MAX_VALUE;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 6, 2, 5};
        System.out.println(Arrays.toString(findNextBigger(arr)));
    }
}
