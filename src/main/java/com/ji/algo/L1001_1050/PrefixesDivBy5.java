package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/4/30
    time 8:25 PM
*/

import java.util.ArrayList;
import java.util.List;

public class PrefixesDivBy5 {
    public static void main(String[] args) {

    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int tmp = 0;
        for (int i = 0; i < A.length; i++) {
            if((A[i]+tmp*2)%5==0){
                res.add(true);
                tmp = 0;
            }else{
                res.add(false);
                tmp = (A[i]+tmp*2)%5;
            }
        }
        return res;
    }
}
