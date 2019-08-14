package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/14
    time 5:03 PM
*/

public class Candy {
    public static void main(String[] args) {

    }

    public int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0){
            return 0;
        }
        int[] nums = new int[ratings.length];//记录每一位孩子得到的糖果数
        nums[0] = 1;
        //先正序遍历，如果后一位比前一位高分，就给比前一位多1的糖果，否则给1
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                nums[i] = nums[i-1] + 1;
            }else {
                nums[i] = 1;
            }
        }
        //在倒叙遍历，如果前一位比后一位高分并且得到的糖果小于或等于后一位，就给前一位孩子比后一位孩子多一个糖果
        for(int i = ratings.length -2 ; i >= 0; i--){
            if(ratings[i] > ratings[i+1] && nums[i] <= nums[i+1]){
                nums[i] = nums[i+1] +1;
            }
        }
        int count = 0;
        for(int i : nums){
            count +=i;
        }
        return count;


    }
}
