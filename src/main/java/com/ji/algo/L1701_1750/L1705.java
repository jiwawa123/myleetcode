package com.ji.algo.L1701_1750;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * user ji
 * data 2021/1/25
 * time 10:35 上午
 */
public class L1705 {
    public static void main(String[] args) {

    }

    public int eatenApples(int[] apples, int[] days) {
        // 优先级队列存储苹果的数量和腐烂日期，分别使用a[0]和a[1]存储；最早的腐烂日期排在堆顶部。
        PriorityQueue<int[]> pq = new PriorityQueue<>((a1, a2) -> Integer.compare(a1[1], a2[1]));
        int n = apples.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (apples[i] > 0) {
                pq.offer(new int[]{apples[i], i + days[i] - 1,});
            }
            // 去除已经过腐烂日期的苹果
            while (!pq.isEmpty() && pq.peek()[1] < i) {
                pq.poll();
            }

            if (!pq.isEmpty()) {
                // 吃掉最早腐烂日期的一个苹果
                int[] apple = pq.poll();
                ans++;
                if (--apple[0] > 0) {
                    pq.offer(apple);
                }
            }
        }

        // 吃掉剩余的苹果
        int latest_day = n - 1;
        while (!pq.isEmpty()) {
            int[] apple = pq.poll();
            if (latest_day < apple[1]) {
                // 如果该批苹果吃完了，也不会过腐烂日期，那么就吃完。
                if (latest_day + apple[0] <= apple[1]) {
                    ans += apple[0];
                    latest_day += apple[0];
                } else {
                    // 如果该批苹果到腐烂日期了，还没能吃完。
                    ans += apple[1] - latest_day;
                    latest_day = apple[1];
                }
            }
        }
        return ans;
    }
}
