package com.ji.algo.second;

import java.util.ArrayList;

/**
 * user ji
 * data 2020/9/1
 * time 4:29 下午
 */
public class SSZ {
    public static void main(String arg[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> res = spiralOrder(arr);
        System.out.println(res);
    }
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList();
        if(matrix==null||matrix.length==0)
            return list;
        int row = matrix.length, col = matrix[0].length;
        int l = 0, r = col-1;
        int up = 0, down = row -1;
        while(true){
            for(int i = l;i<=r;i++){
                list.add(matrix[up][i]);
            }
            if(++up>down)
                break;
            for(int i = up;i<=down;i++){
                list.add(matrix[i][r]);
            }
            if(--r<l)
                break;
            for(int i=r;i>=l;i--){
                list.add(matrix[down][i]);
            }
            if(--down<up){
                break;
            }
            for(int i=down;i>= up;i--){
                list.add(matrix[i][l]);
            }
            if(++l>r){
                break;
            }
        }

        return list;

    }
}
