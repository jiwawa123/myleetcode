package com.ji.algo.game.G0112;/*
    user ji
    data 2020/1/12
    time 10:27 AM
*/

public class G2 {
    public static void main(String[] args) {
        System.out.println(minFlips(8,3,5));
    }

    public static int minFlips(int a, int b, int c) {
        int d = a | b;
        if (d == c)
            return 0;
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        String s3 = Integer.toBinaryString(c);
        int sum = 0;
        int i = s1.length() - 1, j = s2.length() - 1, k = s3.length() - 1;
        while (i >= 0 || j >= 0 || k >= 0) {
            if(k<0){
                if(i>=0&&s1.charAt(i)=='1'){
                    sum++;
                }
                if(j>=0&&s2.charAt(j)=='1'){
                    sum++;
                }
            }else{
                if(s3.charAt(k)=='1'){
                    if(i<0&&j<0){
                        sum++;
                    }else{
                        boolean flag = false;
                        if(i>=0&&s1.charAt(i)=='1'){
                            flag = true;
                        }
                        if(j>=0&&s2.charAt(j)=='1'){
                            flag = true;
                        }
                        if(!flag){
                            sum++;
                        }
                    }
                }else{
                    if(i>=0&&s1.charAt(i)=='1'){
                        sum++;
                    }
                    if(j>=0&&s2.charAt(j)=='1'){
                        sum++;
                    }
                }
            }

            i--;
            j--;
            k--;
        }


        return sum;
    }

}
