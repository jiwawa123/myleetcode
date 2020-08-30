package com.ji.algo.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * user ji
 * data 2020/8/25
 * time 8:07 上午
 */
public class L40 {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();
        help(result,new ArrayList(),0,target,0,arr);
        return new ArrayList(new HashSet(result));
    }
    public void help(List<List<Integer>> list ,List<Integer> tmp,int sum,int target,int start,int[] arr){
        if(tmp.size()>0&&sum==target){
            list.add(tmp);
            return ;
        }
        if(sum>target)
            return;
        for(int i = start;i<arr.length;i++){
            if(sum+arr[i]>target)
                return;
            tmp.add(arr[i]);
            sum+=arr[i];
            help(list,new ArrayList(tmp),sum,target,i+1,arr);
            tmp.remove(tmp.size()-1);
            sum-=arr[i];
        }
    }
}
