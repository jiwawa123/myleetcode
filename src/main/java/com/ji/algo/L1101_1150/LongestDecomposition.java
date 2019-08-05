package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/8/5
    time 5:59 PM
*/

public class LongestDecomposition {
    public static void main(String[] args) {
        System.out.println(longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"));
    }

    public static int longestDecomposition(String text) {
        if (text == null || text.length() == 0)
            return 0;
        int count = 0;
        StringBuilder sp = new StringBuilder();
        StringBuilder last = new StringBuilder();
        int i = 0, j = text.length() - 1;
        while (i < j) {
            sp.append(text.charAt(i++));
            last.insert(0, text.charAt(j--));
            if (sp.toString().equals(last.toString())) {
                count += 2;
                sp = new StringBuilder();
                last = new StringBuilder();

            }
        }
        if(i==j||sp.length()>0)
            return count++;


        return count;
    }
}
