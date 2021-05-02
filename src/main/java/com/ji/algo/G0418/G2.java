package com.ji.algo.G0418;

import java.util.HashSet;
import java.util.Set;

/**
 * user ji
 * data 2021/4/18
 * time 1:09 下午
 */
public class G2 {
    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
