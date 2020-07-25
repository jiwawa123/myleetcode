package com.ji.algo.second;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/7/25
 * time 8:57 上午
 */
public class L502 {
    public static void main(String[] args) {

    }

    class Combine {
        int profit;
        int capital;

        public Combine(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }
    }

    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        List<Combine> combines = new LinkedList<>();
        for (int i = 0; i < Profits.length; i++) {
            combines.add(new Combine(Profits[i], Capital[i]));
        }

        Collections.sort(combines, new Comparator<Combine>() {
            @Override
            public int compare(Combine o1, Combine o2) {
                if (o1.profit == o2.profit)
                    return o1.capital - o2.capital;
                return o2.profit - o1.profit;
            }
        });

        int count = 0;
        // 使用链表 删除相应的位置的数字
        while (count < k) {
            boolean isNext = false;
            for (int i = 0; i < combines.size(); i++) {
                Combine tmp = combines.get(i);
                if (tmp.capital <= W) {
                    count++;
                    W += tmp.profit;
                    combines.remove(i);
                    isNext = true;
                    break;
                }
            }
            if (!isNext) {
                break;
            }
        }
        return W;
    }
}
