package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 9:26 AM
*/

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n == 1)
            return 1 + "";
        StringBuffer sp = new StringBuffer();
        StringBuffer spTmp = new StringBuffer();
        sp.append(1);
        int index = 1;
        while (index < n) {
            int tmp = 0;
            for (int i = 0; i < sp.length(); i++) {
                if (i == 0) {
                    tmp += 1;
                }
                if (i > 0) {
                    if(sp.charAt(i) == sp.charAt(i - 1))
                        tmp += 1;
                    else {
                        spTmp.append(tmp);
                        spTmp.append(sp.charAt(i - 1));
                        tmp = 1;
                    }
                }
                //最后一个位置进行相应的判断
                if (i == sp.length() - 1) {
                    spTmp.append(tmp);
                    spTmp.append(sp.charAt(i));
                }
            }
            index++;
            sp = spTmp;
            spTmp = new StringBuffer();
        }
        return sp.toString();
    }
}
