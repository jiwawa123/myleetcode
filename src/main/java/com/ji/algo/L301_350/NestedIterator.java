package com.ji.algo.L301_350;/*
    user ji
    data 2019/5/2
    time 1:34 PM
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterable<Integer> {

    public Iterator<Integer> iterator() {
        return null;
    }

    List<Integer> list = new ArrayList<>();
    int index = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        for (NestedInteger nest : nestedList
                ) {
            help(nest);
        }
    }

    public void help(NestedInteger l) {
        if (l.isInteger()) {
            list.add(l.getInteger());
        } else {
            List<NestedInteger> tmp = l.getList();
            for (NestedInteger nest : tmp
                    ) {
                help(nest);
            }
        }
    }

    public Integer next() {
        if (hasNext())
            return list.get(index++);
        return null;
    }


    public boolean hasNext() {
        return index < list.size();
    }
}
