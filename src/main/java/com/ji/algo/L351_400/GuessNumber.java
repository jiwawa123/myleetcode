package com.ji.algo.L351_400;/*
    user ji
    data 2019/4/27
    time 8:19 PM
*/

public class GuessNumber {
    public static void main(String[] args) {

    }
    //注意防止溢出
    public int guessNumber(int n) {
        if(guess(n)==0)
            return n;
        int i = 1 ,end = n;
        while(i<end){
            int med = (i)+(end - i)/2;
            if(guess(med)==0){
                return med;
            }else if(guess(med)==-1){
                end = med -1;
            }else {
                i = med+1;
            }
        }
        return i;
    }

    private int guess(int med) {
        return 0;
    }
}
