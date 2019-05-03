package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 9:55 AM
*/

public class AddStrings {
    public static void main(String[] args) {

    }

    public String addStrings(String nums1, String nums2) {
        StringBuffer sp1 = new StringBuffer(nums1).reverse();
        StringBuffer sp2 = new StringBuffer(nums2).reverse();
        StringBuffer res = new StringBuffer();
        int i = 0;
        int next = 0;
        while (i < sp1.length() && i < sp2.length()) {
            int tmp = next + sp1.charAt(i) - '0' + sp2.charAt(i) - '0';
            res.append(tmp % 10);
            next = tmp / 10;
            i++;
        }
        while (i < sp1.length()) {
            int tmp = next + sp1.charAt(i) - '0';
            res.append(tmp % 10);
            next = tmp / 10;
            i++;
        }
        while (i < sp2.length()) {
            int tmp = next + sp2.charAt(i) - '0';
            res.append(tmp % 10);
            next = tmp / 10;
            i++;
        }
        if (next > 0)
            res.append(res);
        return res.reverse().toString();
    }
}
