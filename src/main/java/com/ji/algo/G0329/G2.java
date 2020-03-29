package com.ji.algo.G0329;

/**
 * user ji
 * data 2020/3/29
 * time 12:05 PM
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(numTeams(arr));
    }
    public static int numTeams(int[] rating) {
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[j] <= rating[i])
                    continue;
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[k] <= rating[j])
                        continue;
                    count += 1;
                }
            }
        }

        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[j] >= rating[i])
                    continue;
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[k] >= rating[j])
                        continue;
                    count += 1;
                }
            }
        }
        return count;
    }
}
