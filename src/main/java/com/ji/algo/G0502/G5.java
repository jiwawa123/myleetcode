package com.ji.algo.G0502;

/**
 * user ji
 * data 2021/5/16
 * time 7:05 下午
 */
public class G5 {
    public static void main(String[] args) {

    }

    public String sortSentence(String s) {
        StringBuilder sp = new StringBuilder();
        String[] arr = new String[10];
        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            int tmp = sArr[i].charAt(sArr[i].length() - 1) - '1';
            arr[tmp] = sArr[i].substring(0, sArr[i].length() - 1);
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] == null || arr[i].equals(""))
                break;
            sp.append(arr[i] + " ");
        }


        return sp.toString().trim();
    }
}
