package com.ji.algo.L351_400;/*
    user ji
    data 2019/4/27
    time 1:00 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Twitter {
    /** Initialize your data structure here. */
    class Node{
        int user;
        int tweetId;

        public Node(int user, int tweetId) {
            this.user = user;
            this.tweetId = tweetId;
        }
    }
    List<Node> list = new ArrayList<>();
    Map<Integer,Map<Integer,Integer>> map = new HashMap<>();
    public Twitter() {

    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!map.containsKey(userId)){
            Map<Integer,Integer> tmp = new HashMap<>();
            tmp.put(userId,1);
            map.put(userId,tmp);
        }
        Node node = new Node(userId,tweetId);
        list.add(0,node);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> tmp = new ArrayList<>();
        int i = 0;
        if(!map.containsKey(userId))
            return tmp;
        Map<Integer,Integer> mtmp = map.get(userId);
        while(i<list.size()&&tmp.size()<10){
            Node node = list.get(i++);
            if(mtmp.containsKey(node.user)){
                tmp.add(node.tweetId);
            }
        }
        return tmp;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(!map.containsKey(followerId)){
            Map<Integer,Integer> tmp = new HashMap<>();
            tmp.put(followerId,1);
            tmp.put(followeeId,1);
            map.put(followerId,tmp);
        }else{
            Map<Integer,Integer> tmp = map.get(followerId);
            tmp.put(followeeId,1);
            map.put(followerId,tmp);
        }
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(followerId==followeeId)
            return;
        if(map.containsKey(followerId)){
            Map<Integer,Integer> tmp = map.get(followerId);
            if(tmp.containsKey(followeeId)){
                tmp.remove(followeeId);
                map.put(followerId,tmp);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.follow(1,2);
        twitter.unfollow(1,2);
    }
}
