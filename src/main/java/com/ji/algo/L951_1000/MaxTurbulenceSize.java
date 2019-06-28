package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/28
    time 9:39 PM
*/

public class MaxTurbulenceSize {
    public int maxTurbulenceSize(int[] A) {
        if(A==null)
            return 0;
        if(A.length<2)
            return A.length;
        int len = 0;
        int tmp = 0;
        for(int i = 0;i<A.length-1;i++){
            if(i%2==0){
                if(A[i]<A[i+1]){
                    tmp++;
                    len = Math.max(tmp,len);
                }else{
                    tmp = 0;
                }
            }
            if(i%2!=0){
                if(A[i]>A[i+1]){
                    tmp++;
                    len = Math.max(tmp,len);
                }else{
                    tmp = 0;
                }
            }
        }
        tmp = 0;
        for(int i = 0;i<A.length-1;i++){
            if(i%2!=0){
                if(A[i]<A[i+1]){
                    tmp++;
                    len = Math.max(tmp,len);
                }else{
                    tmp = 0;
                }
            }
            if(i%2==0){
                if(A[i]>A[i+1]){
                    tmp++;
                    len = Math.max(tmp,len);
                }else{
                    tmp = 0;
                }
            }
        }
        return len+1;
    }
}
