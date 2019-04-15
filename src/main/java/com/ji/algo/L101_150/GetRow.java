package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 10:55 AM
*/

import java.util.ArrayList;
import java.util.List;

public class GetRow {
    public List<Integer> getRow(int numRows) {
        List<Integer> tmp = new ArrayList<>();
        if (numRows == 0)
            return tmp;
        tmp.add(1);
        if(numRows==1)
            return tmp;
        for (int i = 2; i <= numRows; i++) {
            List<Integer> next = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0||j==i-1)
                    next.add(1);
                else
                    next.add(tmp.get(j)+tmp.get(j-1));
            }
            tmp = next;
        }
        return tmp;
    }
}
