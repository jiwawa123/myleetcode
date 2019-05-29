package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 8:44 PM
*/

import java.util.ArrayList;
import java.util.List;

public class GenerateP {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generate(res, "", 0, 0, n);
        return res;
    }
    //count1统计“(”的个数，count2统计“)”的个数
    public void generate(List<String> res , String ans, int count1, int count2, int n){
        if(count1 > n || count2 > n) return;
        if(count1 == n && count2 == n)  res.add(ans);
        //不可能会出现count2>count1的情况
        if(count1 >= count2){
            String ans1 = new String(ans);
            generate(res, ans+"(", count1+1, count2, n);
            generate(res, ans1+")", count1, count2+1, n);

        }
    }
}
