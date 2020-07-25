package com.ji.algo.zyb;

/**
 * user ji
 * data 2020/7/23
 * time 2:11 下午
 */
public class L1 {
    public static void main(String[] args) {
        myPrint("343jh76hgj87jhgj");
    }

    public static void myPrint(String word) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            if (isNumber(word.charAt(i))) {
                if (sb.length() == 0) {
                    sb.append("_");
                    sb.append(word.charAt(i));
                    continue;
                }
                if (isNumber(sb.charAt(sb.length() - 1))) {
                    sb.append(word.charAt(i));
                    continue;
                }
                sb.append("_");
                sb.append(word.charAt(i));
            } else {
                if (sb.length() != 0 && isNumber(sb.charAt(sb.length() - 1))) {
                    System.out.println(sb.toString());
                    sb = new StringBuffer();
                }
                sb.append(word.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static boolean isNumber(char a) {
        return a >= '0' && a <= '9';
    }
}

