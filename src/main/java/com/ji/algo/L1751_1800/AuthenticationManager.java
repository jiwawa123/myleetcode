package com.ji.algo.L1751_1800;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2021/3/24
 * time 9:05 上午
 */
public class AuthenticationManager {
    int timeToLive;
    Map<String, Integer> map;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        map = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (!map.containsKey(tokenId) || map.get(tokenId) <= currentTime)
            return;
        map.put(tokenId, currentTime + timeToLive);
    }

    public int countUnexpiredTokens(int currentTime) {
        int res = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()
        ) {
            if (entry.getValue() >= currentTime)
                res++;
        }
        return res;
    }
}
