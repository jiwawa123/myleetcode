package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/4/29
    time 7:59 PM
*/

import java.util.ArrayList;
import java.util.List;

public class RemoveOuterParentheses {
    public static void main(String[] args) {

    }
    public String removeOuterParentheses(String S) {
        List<Character> list = new ArrayList();
        StringBuffer sp = new StringBuffer();
        int left = 0,right = 0;
        int index = 0;
        while(index<S.length()){
            if(left==right&&left!=0){
                for (int i = 1; i < list.size()-1; i++) {
                    sp.append(list.get(i));
                }
                list = new ArrayList<>();
            }
            if(S.charAt(index)=='('){
                list.add(S.charAt(index));
                left++;
            }else{
                list.add(S.charAt(index));
                right++;
            }
            index++;
        }
        if(left==right&&left!=0){
            for (int i = 1; i < list.size()-1; i++) {
                sp.append(list.get(i));
            }
        }
        return sp.toString();
    }
}
