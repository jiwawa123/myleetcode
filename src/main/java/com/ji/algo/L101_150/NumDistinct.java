package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/8
    time 7:17 PM
*/

public class NumDistinct {
    public static void main(String[] args) {
        NumDistinct numDistinct = new NumDistinct();
        long a = System.currentTimeMillis();
        String str = "xslledayhxhadmctrliaxqpokyezcfhzaskeykchkmhpy" +
                "jipxtsuljkwkovmvelvwxzwieeuqnjozrfwmzsylcwvsthnxujvrksz" +
                "qwtglewkycikdaiocglwzukwovsghkhyidevhbgffoqkpabthmqihcfxxzd" +
                "ejletqjoxmwftlxfcxgxgvpperwbqvhxgsbbkmphyomtbjzdjhcrcsggleicz" +
                "pbfjcgtpycpmrjnckslrwduqlccqmgrdhxolfjafmsrfdghnatexyanldrdpxvv" +
                "gujsztuffoymrfteholgonuaqndinadtumnuhkboyzaqguwqijwxxszngextfcozpet" +
                "yownmyneehdwqmtpjloztswmzzdzqhuoxrblppqvyvsqhnhryvqsqogpnlqfulurexdto" +
                "vqpqkfxxnqykgscxaskmksivoazlducanrqxynxlgvwonalpsyddqmaemcrrwvrjmjjnyg" +
                "yebwtqxehrclwsxzylbqexnxjcgspeynlbmetlkacnnbhmaizbadynajpibepbuacggxrqavfn" +
                "wpcwxbzxfymhjcslghmajrirqzjqxpgtgisfjreqrqabssobbadmtmdknmakdigjqyqcruujlwm" +
                "foagrckdwyiglviyyrekjealvvigiesnvuumxgsveadrxlpwetioxibtdjblowblqvzpbrmhupyr" +
                "dophjxvhgzclidzybajuxllacyhyphssvhcffxonysahvzhzbttyeeyiefhunbokiqrpqfcoxdxvefu" +
                "gapeevdoakxwzykmhbdytjbhigffkmbqmqxsoaiomgmmgwapzdosorcxxhejvgajyzdmzlcntqbapbpofdj" +
                "tulstuzdrffafedufqwsknumcxbschdybosxkrabyfdejgyozwillcxpcaiehlelczioskqtptzaczobvyoj" +
                "dlyflilvwqgyrqmjaeepydrcchfyftjighntqzoo";
        String tmp = "rwmimatmhydhbujebqehjprrwfkoebcxxqfktayaaeheys";
        System.out.println(numDistinct.numDistinct(str, tmp));
        System.out.println(System.currentTimeMillis() - a);
    }

    int count = 0;

    public int numDistinct(String s, String t) {
        if (t == null || s == null || s.length() < t.length())
            return 0;
        help(t, s, 0, 0);
        return count;
    }

    public void help(String t, String s, int len, int start) {
        if (len == t.length()) {
            count++;
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(len)) {
                help(t, s, len + 1, i + 1);
            }
        }
    }
}
