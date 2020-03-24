package com.ji.algo.G0322;

/**
 * user ji
 * data 2020/3/22
 * time 10:29 AM
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumFourDivisors(arr));
    }

    public static int sumFourDivisors(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int sqrt = (int) Math.sqrt(nums[i]);
            if (sqrt * sqrt == nums[i])
                continue;
            int count = 0;
            int tmp = 0;
            for (int j = 1; j <= sqrt; j++) {
                if (nums[i] % j == 0) {
                    count += 2;
                    tmp += nums[i] / j + j;
                }
                if (count > 4) {
                    break;
                }
            }

            if (count == 4) {
                System.out.println(nums[i]);
                res += tmp;
            }
        }
        return res;
    }

}
