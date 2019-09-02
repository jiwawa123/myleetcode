package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/28
    time 4:28 PM
*/

public class NestedListWeightSum {
    public static void main(String[] args) {
        System.out.println(solution("[1,[4,[6]]]]"));
    }

    public static  int solution(String tmp) {
        int count = 0;
        int dep = 0;
        int num = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '[') {
                dep++;
                continue;
            }
            if (tmp.charAt(i) == ']') {
                count += num * dep;
                dep--;
                num = 0;
                continue;
            }
            if (tmp.charAt(i) == ',') {
                count += num * dep;
                num = 0;
                continue;
            }
            num += num * 10 + tmp.charAt(i) - '0';
        }
        return count;
    }
}
