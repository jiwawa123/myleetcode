package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/12
    time 11:22 AM
*/

public class Compress {
    public static void main(String[] args) {
        char c[] = {'a','a'};
        compress(c);
    }

    public static int compress(char[] chars) {
        if (null == chars || chars.length == 0)
            return 0;
        int len = 0;
        char tmp = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == tmp) {
                count++;
            } else {
                chars[len++] = tmp;
                tmp = chars[i];
                if(count==1)
                    continue;
                String str = count+"";
                for (int j = 0; j < str.length(); j++) {
                    chars[len++] = str.charAt(j);
                }
                count = 1;
            }
        }
        chars[len++] = tmp;
        if(count==1)
            return len;
        String str = count+"";
        for (int j = 0; j < str.length(); j++) {
            chars[len++] = str.charAt(j);
        }
        return len;
    }
}
