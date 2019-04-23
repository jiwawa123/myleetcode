package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:53 PM
*/

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[index] = nums[i];
            }
            i++;
        }
        for (int j = nums.length - count - 1; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (tmp == nums[j])
                    return tmp;
            }
        }
        return 0;
    }
    /**
     快慢指针思想, fast 和 slow 是指针, nums[slow] 表示取指针对应的元素
     注意 nums 数组中的数字都是在 1 到 n 之间的(在数组中进行游走不会越界),
     因为有重复数字的出现, 所以这个游走必然是成环的, 环的入口就是重复的元素,
     即按照寻找链表环入口的思路来做
     **/
    public int findDuplicateII(int[] nums) {
        int fast = 0, slow = 0;
        while(true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(slow == fast) {
                fast = 0;
                while(nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
