package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/23:56
 */
public class L17 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        final String s = "";

    }

    public List<String> letterCombinations(String digits) {
        int len = digits.length();
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        res.add("");
        for (int i = 0; i < len; i++) {
            int index = digits.charAt(i) - '0';
            List<String> tmp = new LinkedList<>();
            for (int j = 0; j < res.size(); j++) {
                for (int k = 0; k < arr[index].length(); k++) {
                    tmp.add(res.get(j) + arr[index].charAt(k));
                }
            }
            res = tmp;
        }
        return res;
    }
}
