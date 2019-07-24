package com.ji.algo.L501_550;/*
    user ji
    data 2019/7/24
    time 9:08 AM
*/

import java.util.HashMap;
import java.util.Map;

public class CodeC {
    Map<String,String> map = new HashMap();
    Map<String,String> map1 = new HashMap();
    int max = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(map1.containsKey(longUrl))
            return map1.get(longUrl);
        max++;
        map1.put(longUrl,max+"");
        map.put(max+"",longUrl);
        return max+"";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl+"");
    }
}
