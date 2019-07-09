package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/7/9
    time 9:23 AM
*/

public class NumEnclaves {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 1, 1, 1, 0, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 0, 1, 0, 0}, {0, 1, 1, 0, 0, 0, 1, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 0, 0, 1, 0}, {0, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 1, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0, 0, 1}};
        System.out.println(new NumEnclaves().numEnclaves(arr));
    }

    public int numEnclaves(int[][] A) {
        boolean[][] isBlocked = new boolean[A.length][A[0].length];
        boolean[][] visited = new boolean[A.length][A[0].length];

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++){
                isBlocked[i][j] = true;
                visited[i][j] = false;
            }
        }

        //Upside border
        for(int col = 0; col < A[0].length; col++) {
            if (A[0][col] == 1 && !visited[0][col]) {
                dfs(A, 0, col, isBlocked, visited);
            }
        }

        //Downside border
        for(int col = 0; col < A[A.length - 1].length; col++) {
            if (A[A.length - 1][col] == 1 && !visited[A.length - 1][col]) {
                dfs(A, A.length - 1, col, isBlocked, visited);
            }
        }

        for(int row = 0; row < A.length; row++){
            if (A[row][0] == 1 && !visited[row][0]){
                dfs(A, row, 0, isBlocked, visited);
            }
        }

        for(int row = 0; row < A.length; row++){
            if (A[row][A[0].length - 1] == 1 && !visited[row][A[0].length - 1]){
                dfs(A, row, A[0].length - 1, isBlocked, visited);
            }
        }
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++){
                if(A[i][j] == 1 && isBlocked[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] A, int row, int col, boolean[][] isBlocked, boolean[][] visited) {
        isBlocked[row][col] = false;
        visited[row][col] = true;
        if(row - 1 > 0 && A[row - 1][col] == 1 && !visited[row - 1][col]){
            dfs(A, row - 1, col, isBlocked, visited);
        }
        if(row + 1 < A.length - 1 && A[row + 1][col] == 1 && !visited[row + 1][col]){
            dfs(A, row + 1, col, isBlocked, visited);
        }
        if(col - 1 > 0 && A[row][col - 1] == 1 && !visited[row][col - 1]){
            dfs(A, row, col - 1, isBlocked, visited);
        }
        if(col + 1 < A[0].length && A[row][col + 1] == 1 && !visited[row][col + 1]){
            dfs(A, row, col + 1, isBlocked, visited);
        }
    }

}
