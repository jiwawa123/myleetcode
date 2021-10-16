package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/10/12
 * @time 10:15 下午
 */
public class L2016 {
    public static void main(String[] args) {
        int arr[] = {999, 997, 980, 976, 948, 940, 938, 928, 924, 917, 907, 907, 881, 878, 864, 862, 859, 857, 848, 840, 824, 824, 824, 805, 802, 798, 788, 777, 775, 766, 755, 748, 735, 732, 727, 705, 700, 697, 693, 679, 676, 644, 634, 624, 599, 596, 588, 583, 562, 558, 553, 539, 537, 536, 509, 491, 485, 483, 454, 449, 438, 425, 403, 368, 345, 327, 287, 285, 270, 263, 255, 248, 235, 234, 224, 221, 201, 189, 187, 183, 179, 168, 155, 153, 150, 144, 107, 102, 102, 87, 80, 57, 55, 49, 48, 45, 26, 26, 23, 15};
        System.out.println(maximumDifference(arr));
    }

    public static int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (min >= nums[i]) {
                min = nums[i];
            } else {
                res = Math.max(res, nums[i] - min);
            }
        }
        return res;
    }
}
