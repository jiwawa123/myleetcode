package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/3
    time 11:12 PM
*/

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        int arr[] = {-2, 4, -5, 7, -9};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
            } else {
                if (!(asteroids[i] < 0 && stack.peek() > 0)) {
                    stack.push(asteroids[i]);
                } else {
                    int tmp = 0;
                    if (Math.abs(asteroids[i]) > Math.abs(stack.peek()))
                        tmp = asteroids[i];
                    if (Math.abs(asteroids[i]) < Math.abs(stack.peek()))
                        tmp = stack.peek();
                    stack.pop();
                    if (tmp == 0)
                        continue;
                    while (!stack.isEmpty() && (tmp < 0 && stack.peek() > 0)) {
                        if (Math.abs(asteroids[i]) > Math.abs(stack.peek()))
                            tmp = asteroids[i];
                        if (Math.abs(asteroids[i]) < Math.abs(stack.peek()))
                            tmp = stack.peek();
                        if (Math.abs(asteroids[i]) == Math.abs(stack.peek()))
                            tmp = 0;
                        stack.pop();
                    }
                    if (tmp != 0)
                        stack.push(tmp);
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        while (!stack.isEmpty())
            list.add(0, stack.pop());
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
