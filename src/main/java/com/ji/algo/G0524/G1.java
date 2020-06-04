package com.ji.algo.G0524;

/**
 * user ji
 * data 2020/5/24
 * time 10:30 上午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        if (sentence == null || sentence.length() < searchWord.length())
            return -1;
        String tmp[] = sentence.split(" ");
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].startsWith(searchWord))
                return i+1;
        }
        return -1;
    }
}
