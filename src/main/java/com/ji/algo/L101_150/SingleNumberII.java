package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 4:30 PM
*/

public class SingleNumberII {
    public static void main(String[] args) {

    }
    //这是一个电路题，需要一个数字*3之后为0即可
    public int singleNumber(int[] nums) {
        int one = 0, two = 0, three;
        for (int num : nums) {
            // two的相应的位等于1，表示该位出现2次
            two |= (one & num);
            // one的相应的位等于1，表示该位出现1次
            one ^= num;
            // three的相应的位等于1，表示该位出现3次
            three = (one & two);
            // 如果相应的位出现3次，则该位重置为0
            two &= ~three;
            one &= ~three;
        }
        return one;
    }
}
