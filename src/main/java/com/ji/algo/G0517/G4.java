package com.ji.algo.G0517;

/**
 * user ji
 * data 2020/5/17
 * time 6:43 下午
 */
public class G4 {
    public static void main(String[] args) {

    }

    public int maxPower(String s) {
        int res = 0;
        char t = ' ';
        int max = 0;
        for (char a : s.toCharArray()
        ) {
            if (a == t) {
                max++;
            }else{
                t = a;
                max = 1;
            }
            res = Math.max(res,max);
        }
        return res;
    }
}
