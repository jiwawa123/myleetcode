package com.ji.thread.ProductAndConsumer;/*
    user ji
    data 2019/5/22
    time 11:06 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Product {
    public List<String> list = new ArrayList<>();

    public void add(String str) {
        list.add(str);
    }

    public int getSize() {
        return list.size();
    }

    public String consume() {
        String tmp = list.get(0);
        list.remove(0);
        return tmp;
    }
}
