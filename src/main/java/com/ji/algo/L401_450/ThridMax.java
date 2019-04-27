package com.ji.algo.L401_450;/*
    user ji
    data 2019/4/27
    time 11:13 PM
*/

import java.util.ArrayList;
import java.util.List;

public class ThridMax {
    public static void main(String[] args) {
        int arr[] = {5,2,4,1,3,6,0};
        System.out.println(thirdMaxII(arr));
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean f = true;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE && f) {
                flag++;
                f = false;
            }
            if (nums[i] > max1) {
                flag++;
                //原先第二大传递给第三大
                max3 = max2;
                //原先最大值传递给第二大
                max2 = max1;
                //更新最大值
                max1 = nums[i];
            } else if (nums[i] > max2 && nums[i] < max1) {
                flag++;
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3 && nums[i] < max2) {
                flag++;
                max3 = nums[i];
            }
        }
        return flag >= 3 ? max3 : max1;
    }

    public static int thirdMaxII(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int k:nums
             ) {
            if(list.isEmpty()){
                list.add(k);
                continue;
            }

            for (int i = 0; i < list.size(); i++) {
                if(k==list.get(i))
                    break;
                if(k>list.get(i)){
                    list.add(i,k);
                    if(list.size()>3)
                        list.remove(list.get(3));
                    break;
                }
                if(k<list.get(i)&&i==list.size()-1&&i<3){
                    list.add(i+1,k);
                    if(list.size()>3)
                        list.remove(list.get(3));
                    break;
                }
            }
        }
        return list.size() == 3 ? list.get(2) : list.get(0);
    }

}
