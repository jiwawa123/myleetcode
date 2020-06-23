package com.ji.algo.G0607;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/6/7
 * time 10:27 上午
 */
public class BrowserHistory {
    List<String> history = new LinkedList<>();
    int index = -1;

    public BrowserHistory(String homepage) {
        history.add(homepage);
        index++;
    }

    public void visit(String url) {
        history = copy(history, url);
    }

    public String back(int steps) {
        while (index > 0 && steps > 0) {
            steps--;
            index--;
        }
        return history.get(index);
    }

    public String forward(int steps) {
        while (index < history.size() && steps > 0) {
            index++;
            steps--;
        }
        if (index >= history.size())
            index = history.size() - 1;
        return history.get(index);
    }

    public List<String> copy(List<String> res, String url) {
        List<String> tmp = new LinkedList<>();
        for (int i = 0; i < index + 1; i++) {
            tmp.add(res.get(i));
        }
        tmp.add(url);
        index++;
        return tmp;
    }


    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory("leetcode.com");
        history.visit("google.com");
        history.visit("facebook.com");
        history.visit("youtube.com");
        System.out.println(history.back(1));
        System.out.println(history.back(1));
        System.out.println(history.forward(1));
        history.visit("linkedin.com");
        System.out.println(history.forward(2));
        System.out.println(history.back(2));
        System.out.println(history.back(7));
    }
}
