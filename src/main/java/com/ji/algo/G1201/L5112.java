package com.ji.algo.G1201;/*
    user ji
    data 2019/12/1
    time 11:48 AM
*/

public class L5112 {
    public static void main(String[] args) {

    }

    public String toHexspeak(String num) {
        String tmp[] = {"A", "B", "C", "D", "E", "F", "I", "O"};
        int k = Integer.valueOf(num);
        StringBuilder sp = new StringBuilder();
        while (k > 0) {
            int t = k % 16;
            if (t > 9) {
                sp.append(tmp[t - 10]);
            } else {
                if(t>2)
                    return "ERROR";
                sp.append(t);
            }
            k /= 16;
        }
        String res = sp.reverse().toString();
        res = res.replaceAll("0","O");
        res = res.replaceAll("1","I");
        return res;
    }
}
