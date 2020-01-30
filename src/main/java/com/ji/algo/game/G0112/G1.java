package com.ji.algo.game.G0112;/*
    user ji
    data 2020/1/12
    time 10:27 AM
*/

public class G1 {
    public static void main(String[] args) {

    }

    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        for (int i = 1; i < n / 2 + 1; i++) {
            int j = n - i;
            if(match(i)&&match(j)){
                arr[0] = i;
                arr[1] = j;
                break;
            }

        }
        return arr;
    }

    public boolean match(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
}
