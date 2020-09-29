package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * user ji
 * data 2020/9/24
 * time 8:43 上午
 */
public class L501 {
    Map<Integer, Integer> map = new LinkedHashMap<>();

    public int[] findMode(TreeNode root) {
        preOrder(root);
        List<Integer> res = new LinkedList<>();
        Map<Integer,Integer> tmp = map.entrySet().stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                ));
        int max = 0;
        for (Map.Entry<Integer,Integer> entry:tmp.entrySet()) {
            if(entry.getValue()>=max){
                res.add(entry.getKey());
                max = entry.getValue();
            }else{
                break;
            }
        }
        int arr[] = new int[tmp.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(i);
        }
        return arr;
     }

    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        preOrder(root.left);
        preOrder(root.right);
    }
}
