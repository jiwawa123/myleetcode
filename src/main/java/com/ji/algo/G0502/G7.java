package com.ji.algo.G0502;

import java.util.ArrayList;
import java.util.List;

/**
 * user ji
 * data 2021/5/16
 * time 7:17 下午
 */
public class G7 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 6};
//        System.out.println(subsetXORSum(arr));
    }

    List<List<Integer>> list=new ArrayList<>();
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        List<Integer> path=new ArrayList<>();
        backTrace(0,nums,path);
        int res=0;
        for(List<Integer> ls:list){
            res+=computeXor(ls);
        }
        return res;
    }
    public int computeXor(List<Integer> ls){
        if(ls.size()==0){return 0;}
        int tmp=0;
        for(int i=0;i<ls.size();i++){
            tmp=tmp^ls.get(i);
        }
        return tmp;
    }
    public void backTrace(int index,int[] nums,List<Integer> path){

        list.add(new ArrayList<>(path));

        for(int i=index;i<nums.length;i++){
            path.add(nums[i]);
            backTrace(i+1,nums,path);
            path.remove(path.size()-1);
        }
    }
}
