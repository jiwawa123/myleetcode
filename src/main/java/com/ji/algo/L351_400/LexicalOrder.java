package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/2
    time 4:27 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LexicalOrder {
    public static void main(String[] args) {

    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return match(o1,o2);
            }
        });
        return list;
    }
    public int match(int a,int b){
        String aa = a+"";
        String bb = b+"";
        int i = 0;
        while(i<aa.length()&&i<bb.length()){
            if(aa.charAt(i)==bb.charAt(i)){
                i++;
                continue;
            }else if(aa.charAt(i)>bb.charAt(i)){
                return 1;
            }else{
                return -1;
            }
        }
        return aa.length() - bb.length();
    }
}
