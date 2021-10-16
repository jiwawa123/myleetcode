package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/10/10
 * @time 10:08 下午
 */
public class L2011 {
    public static void main(String[] args) {

    }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String tmp : operations){
            if(tmp.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}
