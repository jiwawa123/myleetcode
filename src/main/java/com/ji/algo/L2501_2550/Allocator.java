package com.ji.algo.L2501_2550;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/18:44
 */
public class Allocator {

    public static void main(String[] args) {
        Allocator allocator = new Allocator(50);
        allocator.allocate(12, 6);
        allocator.allocate(28, 16);
        allocator.free(6);
        allocator.allocate(12, 45);

    }

    int len = 0;
    List<HelpAllocator> list = new LinkedList<>();

    public Allocator(int n) {
        len = n;
    }

    public int allocate(int size, int mID) {
        //找到对应位置进行插入

        for (int i = 0; i < list.size(); i++) {
            // 判断起始位置可用
            HelpAllocator pre = list.get(i);
            if (i == 0) {
                if (size <= pre.start) {
                    HelpAllocator nowHelp = new HelpAllocator(mID, 0, size);
                    list.add(0, nowHelp);
                    return 0;
                }
            }
            if (i < list.size() - 1) {
                HelpAllocator next = list.get(i + 1);
                if (pre.end + size <= next.start) {
                    HelpAllocator nowHelp = new HelpAllocator(mID, pre.end, pre.end + size);
                    list.add(i + 1, nowHelp);
                    return nowHelp.start;
                }
            }

        }
        HelpAllocator nowHelp = null;
        if (list.size() == 0) {
            nowHelp = new HelpAllocator(mID, 0, 0);
        } else {
            nowHelp = list.get(list.size() - 1);
        }
        if (nowHelp.end + size <= len) {
            HelpAllocator last = new HelpAllocator(mID, nowHelp.end, nowHelp.end + size);
            list.add(last);
            return last.start;
        }
        return -1;
    }

    public int free(int mID) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mID == mID) {
                sum += list.get(i).end - list.get(i).start;
                list.remove(i);
                i--;
            }
        }
        return sum;
    }
}

class HelpAllocator {
    int mID;
    int start;
    int end;

    public HelpAllocator(int mID, int start, int end) {
        this.mID = mID;
        this.start = start;
        this.end = end;
    }
}
