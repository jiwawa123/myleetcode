package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/1
 * time 10:51 上午
 */
public class L1774 {


    int[] used;
    int ans = 100000, diff = 100000;

    private void dfs(int[] cost, int len, int base, int target) {
        int cur = Math.abs(target - base);
        if (diff >= cur) {
            if (diff == cur && base > ans) {
                return;
            }
            ans = base;
            diff = cur;
        }
        if (base > target) {
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i] == 2) {
                continue;
            }
            used[i]++;
            dfs(cost, len, base + cost[i], target);
            used[i]--;
        }
    }

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int len = toppingCosts.length;
        used = new int[len];

        for (int base : baseCosts) {
            dfs(toppingCosts, len, base, target);
        }

        return ans;
    }
}
