package com.ji.algo.G1201;/*
    user ji
    data 2019/12/1
    time 10:24 AM
*/

public class G1 {
    public static void main(String[] args) {
        int arr[][] = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        System.out.println(new G1().tictactoe(arr));
    }

    public String tictactoe(int[][] moves) {
        if (moves.length <= 4)
            return "Pending";
        int arr[][] = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i][0];
            int y = moves[i][1];
            arr[x][y] = i % 2 == 0 ? 1 : 2;
            if (i < 4)
                continue;
            int res = help(arr);
            if (res == 1)
                return "A";
            if (res == 2)
                return "B";
        }
        if(moves.length==9)
            return "Draw";
        return "Pending";
    }

    public int help(int[][] moves) {
        for (int i = 0; i < moves.length; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < moves[i].length; j++) {
                if (moves[i][j] == 1)
                    a++;
                if (moves[i][j] == 2)
                    b++;
            }
            if (a == 3)
                return 1;
            if (b == 3)
                return 2;
        }
        for (int i = 0; i < 3; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < 3; j++) {
                if (moves[j][i] == 1)
                    a++;
                if (moves[j][i] == 2)
                    b++;
            }
            if (a == 3)
                return 1;
            if (b == 3)
                return 2;
        }
        int a = 0, b = 0;
        for (int i = 0; i < 3; i++) {
            if (moves[i][i] == 1)
                a++;
            if (moves[i][i] == 2)
                b++;
            if (a == 3)
                return 1;
            if (b == 3)
                return 2;
        }
        a = 0;
        b = 0;
        for (int i = 0; i < 3; i++) {
            if (moves[2 - i][i] == 1)
                a++;
            if (moves[2 - i][i] == 2)
                b++;
            if (a == 3)
                return 1;
            if (b == 3)
                return 2;
        }

        return 0;
    }
}
