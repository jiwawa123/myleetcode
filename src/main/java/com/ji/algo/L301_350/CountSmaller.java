package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/7
    time 10:18 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSmaller {
    public static void main(String[] args) {

    }

    public List<Integer> countSmaller(int[] nums) {
        //排序数组
        List<Integer> temp = new ArrayList<>();
        //结果数组
        Integer[] res = new Integer[nums.length];

        //原数组从后向前遍历，根据二分法升序插入到新数组
        for(int i=nums.length-1;i>=0;i--){
            int left = 0,right = temp.size();
            while(left<right){
                int mid =left+(right-left)/2;
                if(temp.get(mid)>=nums[i]){
                    right = mid;
                }else{
                    left = mid+1;
                }
            }
            //新数组对应位置的下标即为原数组右侧小于该数的个数
            res[i] = left;
            temp.add(left,nums[i]);
        }
        return Arrays.asList(res);
    }
}
