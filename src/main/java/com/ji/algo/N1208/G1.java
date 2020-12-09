package com.ji.algo.N1208;

/**
 * user ji
 * data 2020/12/8
 * time 8:13 上午
 */
public class G1 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }

    public static String interpret(String command) {
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            switch (command.charAt(i)) {
                case 'G':
                    sp.append('G');
                    i++;
                    break;
                case '(':
                    if (i < command.length() - 1 && command.charAt(i + 1) == ')') {
                        sp.append('o');
                        i += 2;
                    } else {
                        sp.append("al");
                        i += 4;
                    }
                    break;
            }
        }
        return sp.toString();
    }
}
