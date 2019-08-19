package com.ji.algo.L351_400;/*
    user ji
    data 2019/8/19
    time 10:21 AM
*/

public class Deserialize {
    public static void main(String[] args) {

    }

    public NestedInteger deserialize(String s) {
//        if (s.charAt(0) != '[') return new NestedInteger(Integer.parseInt(s));
//        else {
//            NestedInteger result = new NestedInteger();
//            int index = -1, cnt = 0;
//            for (int i = 1; i < s.length() - 1; ++i) {
//                char ch = s.charAt(i);
//                if (ch == '[') {
//                    if (index == -1) index = i;
//                    cnt++;
//                } else if (ch == ']') {
//                    cnt--;
//                } else if (ch == ',') {
//                    if (cnt > 0) continue;
//                    result.add(deserialize(s.substring(index, i)));
//                    index = -1;
//                } else {
//                    if (index == -1) index = i;
//                }
//            }
//            if (index != -1) result.add(deserialize(s.substring(index, s.length()-1)));
//            return result;
//        }
        return null;
    }
}
