package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/11
    time 9:41 PM
*/

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWords {
    public static void main(String[] args) {
        String para = "j. t? T. z! R, v, F' x! L; l! W. M; S. y? r! n; O. q; I? h; w. t; y; X? y, p. k! k, h, J, r? w! U! V; j' u; R! z. s. T' k. P? M' I' j! y. P, T! e; X. w? M! Y, X; G; d, X? S' F, K? V, r' v, v, D, w, K! S? Q! N. n. V. v. t? t' x! u. j; m; n! F, V' Y! h; c! V, v, X' X' t? n; N' r; x. W' P? W; p' q, S' X, J; R. x; z; z! G, U; m. P; o. P! Y; I, I' l' J? h; Q; s? U, q, x. J, T! o. z, N, L; u, w! u, S. Y! V; S? y' E! O; p' X, w. p' M, h! R; t? K? Y' z? T? w; u. q' R, q, T. R? I. R! t, X, s? u; z. u, Y, n' U; m; p? g' P? y' v, o? K? R. Q? I! c, X, x. r' u! m' y. t. W; x! K? B. v; m, k; k' x; Z! U! p. U? Q, t, u' E' n? S' w. y; W, x? r. p! Y? q, Y. t, Z' V, S. q; W. Z, z? x! k, I. n; x? z; V? s! g, U; E' m! Z? y' x? V! t, F. Z? Y' S! z, Y' T? x? v? o! l; d; G' L. L, Z? q. w' r? U! E, H. C, Q! O? w! s? w' D. R, Y? u. w, N. Z? h. M? o, B, g, Z! t! l, W? z, o? z, q! O? u, N; o' o? V; S! z; q! q. o, t! q! w! Z? Z? w, F? O' N' U' p? r' J' L; S. M; g' V. i, P, v, v, f; W? L, y! i' z; L? w. v, s! P?";
        String arr[] = {"m","q","e","l","c","i","z","j","g","t","w","v","h","p","d","b","a","r","x","n"};
        System.out.println(mostCommonWord(para,arr));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.trim();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < banned.length; i++) {
            map.put(banned[i], 1);
        }
        Map<String, Integer> res = new HashMap<>();
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < paragraph.length(); i++) {
            char t = paragraph.charAt(i);
            if (t!='\''&&t != '.' && t != '?' && t != '!' && t != 's' && t != ';' && t != ',' && t != ' ') {
                sp.append(t);
            } else {
                if (sp.length() > 0&&!map.containsKey(sp.toString()))
                    res.put(sp.toString(), res.getOrDefault(sp.toString(), 0)+1);
                sp = new StringBuffer();
            }

        }
        if (sp.length() > 0&&!map.containsKey(sp.toString()))
            res.put(sp.toString(), res.getOrDefault(sp.toString(), 0)+1);
        int max = 0;
        String string = "";
        for (String str: res.keySet()
             ) {
            if(res.get(str)>max){
                string = str;
                max = res.get(str);
            }
        }
        return string;
    }
}
