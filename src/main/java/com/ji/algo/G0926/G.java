package com.ji.algo.G0926;

/**
 * user ji
 * data 2020/9/26
 * time 10:00 上午
 */
public class G {
    public static void main(String[] args) {
       // System.out.println(is_palindrome(4));
    }

    public int is_palindrome(int num) {
        if (num == 0)
            return 1;
        StringBuilder sp = new StringBuilder();
        while (num > 0) {
            sp.append(num % 2);
            num /= 2;
        }
        int i = 0, j = sp.length() - 1;
        while (i < j) {
            if (sp.charAt(i++) != sp.charAt(j--))
                return 0;
        }
        return 1;
    }
}
