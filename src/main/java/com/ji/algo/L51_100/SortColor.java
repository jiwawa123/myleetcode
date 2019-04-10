package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 5:32 PM
*/

import java.util.Arrays;

public class SortColor {
    //直接进行排序即可
    public void sortColorsI(int[] nums) {
        Arrays.sort(nums);
    }

    //通过两次遍历，第一次是计算各自的个数，第二次进行填入
    public void sortColorsII(int[] nums) {
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    one++;
                    break;
                case 1:
                    two++;
                    break;
                default:
                    three++;
                    break;
            }
        }
        int index = 0;

        while (one > 0) {
            nums[index++] = 0;
            one--;
        }
        while (two > 0) {
            nums[index++] = 0;
            two--;
        }
        while (three > 0) {
            nums[index++] = 0;
            three--;
        }
    }

    public void sortColorsIII(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int len = nums.length;
        int i = 0;//始终指向值为0的位置
        int j = len - 1;//始终指向值为2的位置
        for (int k = 0; k < len; k++) {
            if (k > j) break;//j后面全是2，所以如果超过了j，就不用再比了
            if (nums[k] == 0 && k != i) {
                swap(nums, k, i);//将值为0的数交换到i的位置
                k--;//交换回来的值还需要比较，所以保持当前遍历位置k不变
                i++;//值为0的指针向右移动一下

            } else if (nums[k] == 2 && k != j) {
                swap(nums, k, j);//将值为2的数交换到j的位置
                k--;//交换回来的值还需要比较，所以保持当前遍历位置k不变
                j--;//值为2的指针向左移动一下
            }

        }
    }

    //工具函数用来交换
    public void swap(int num[], int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

}
