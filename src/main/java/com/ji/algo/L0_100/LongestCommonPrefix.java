package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 10:22 AM
*/

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    /*
   先找到最短的那个字符串，然后使用这个字符串从大向小开始一次匹配
   */
    public String longestCommonPrefix(String[] strs) {
        String tmp = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                tmp = strs[i];
            }
        }
        for (int i = tmp.length() - 1; i >= 0; i--) {
            final String ttmp = tmp.substring(0,i+1);
            boolean flag = Arrays.stream(strs).parallel().
                    allMatch(s -> s.startsWith(ttmp));
            if(flag)
                return ttmp;
        }
        return "";
    }
    //这个直接使用并行，而且没有使用流的方法，虽然代码长度看起来很多，但是直接使用流开销比较大

    public String longestCommonPrefixII(String[] strs) {
        String answer = "";
        if(strs.length==0)
            return answer;
        if(strs.length==1)
            return strs[0];
        String tmp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length()<tmp.length()){
                tmp = strs[i];
            }
        }
        if(tmp.equals(""))
            return "";
        int k = tmp.length();
        while(k>0){
            String ttmp = tmp.substring(0,k);
            int count = 0;
            //开始寻找最长前缀
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].substring(0,k).equals(ttmp)){
                    count++;
                }else{
                    break;
                }
            }
            if(count==strs.length){
                return ttmp;
            }
            k--;
        }

        return answer;
    }
}
