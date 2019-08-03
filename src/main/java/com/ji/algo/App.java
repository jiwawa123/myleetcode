package com.ji.algo;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello");
        }
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

    public String countAndSay(int n) {
        if (n == 1)
            return 1 + "";
        StringBuilder sp = new StringBuilder("1");
        int tmp = 1;
        while (tmp < n) {
            StringBuilder sp1 = new StringBuilder();
            int count = 0;
            char a = sp.charAt(0);
            int index = 0;
            while (index < sp.length()) {
                if (sp.charAt(index) == a) {
                    count++;
                } else {
                    sp1.append(count);
                    sp1.append(a);
                    a = sp.charAt(index);
                    count = 1;
                }
                if (index == sp.length() - 1) {
                    sp1.append(count);
                    sp1.append(a);
                }
                index++;
            }
            sp = sp1;
            tmp++;
        }
        return sp.toString();
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while (!isLetterOrNumber(s.charAt(i)) && i < j) {
                i++;
            }
            while (!isLetterOrNumber(s.charAt(j)) && j > i) {
                j--;
            }
            if (i < j) {
                if (s.charAt(i++) != s.charAt(j--))
                    return false;
            }
        }
        return true;
    }

    public boolean isLetterOrNumber(char a) {
        return (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9') || (a >= 'A' && a <= 'Z');
    }

    public List<String> letterCombinations(String a) {
        List<String> list = new ArrayList();
        if (a == null || a.length() == 0) {
            return list;
        }
        list.add("");
        String arr[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < a.length(); i++) {
            List<String> tmp = new ArrayList<>();
            int index = a.charAt(i) - '2';
            for (int j = 0; j < arr[index].length(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    tmp.add(list.get(k) + arr[index].charAt(j));
                }
            }
            list = tmp;
        }
        return list;
    }
}
