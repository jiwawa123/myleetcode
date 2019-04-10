package com.ji.algo.L51_100;
/*
    user ji
    data 2019/4/10
    time 3:41 PM
*/
import java.util.ArrayList;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        //combine(4,2);
    }
    List<List<Integer>> list;
    public  List<List<Integer>> combine(int n, int k) {
        list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs_help(tmp,k,n,1);
        return list;
    }
    //
    public  void  dfs_help(List<Integer> tmp ,int k,int n,int start){
        if(k==0){
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <= n ; i++) {
            tmp.add(i);
            dfs_help(tmp,k-1,n,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
